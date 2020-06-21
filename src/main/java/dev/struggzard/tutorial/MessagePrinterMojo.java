package dev.struggzard.tutorial;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * A Mojo which accepts parameter and prints it.
 */
@Mojo(name = "print")
public class MessagePrinterMojo extends AbstractMojo {

    @Parameter( property = "print.text", defaultValue = "Default text" )
    private String textParameter;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(textParameter);
    }
}
