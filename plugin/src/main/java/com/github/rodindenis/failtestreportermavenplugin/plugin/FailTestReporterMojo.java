package com.github.rodindenis.failtestreportermavenplugin.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Mojo(name = "fail-test-reporter", defaultPhase = LifecyclePhase.POST_INTEGRATION_TEST)
public class FailTestReporterMojo extends AbstractMojo {

    @Parameter(property = "reports")
    String report;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        Log log = getLog();

        Path path = Paths.get(report);

        log.info(String.format("reports parameter is %s", report));
        log.info("Is file exists " + Files.exists(path));

        try {
            Files.lines(path).forEach(log::info);
        } catch (IOException e) {
            throw new MojoExecutionException(String.format("Can't read report file %s", report), e);
        }
    }
}
