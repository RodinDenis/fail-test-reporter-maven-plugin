package com.github.rodindenis.failtestreportermavenplugin.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.JSONCucumberReportParser;

import java.io.File;
import java.io.IOException;

@Mojo(name = "fail-test-reporter", defaultPhase = LifecyclePhase.POST_INTEGRATION_TEST)
public class FailTestReporterMojo extends AbstractMojo {

    @Parameter(property = "reports")
    String report;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug(String.format("reports parameter is %s", report));

        JSONCucumberReportParser parser;

        try {
            parser = new JSONCucumberReportParser(new File(report));
        } catch (IOException e) {
            throw new MojoFailureException(String.format("Can't read report file %s", report), e);
        }

        getLog().info("Failed features count: " + parser.getFailedFeaturesCount());

    }
}
