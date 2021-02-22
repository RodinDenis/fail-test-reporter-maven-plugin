package com.github.rodindenis.failtestreportermavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "fail-test-reporter", defaultPhase = LifecyclePhase.TEST)
public class FailTestReporterMojo extends AbstractMojo {

    @Parameter(property = "reports")
    String reports;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("reports parameter is %s", reports));
    }
}
