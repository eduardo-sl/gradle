/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.gradle.sample.plugin;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A simple unit test for the 'org.gradle.sample.plugin.greeting' plugin.
 */
public class GradlePluginInJavaPluginTest {
    @Test public void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("org.gradle.sample.plugin.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
