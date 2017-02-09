// This plugin is based on https://github.com/JakeWharton/hugo
package com.sensorsdata.analytics.android.plugin

import com.android.build.gradle.AppPlugin
import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * aspectj plugin,
 * @author simon
 * @version 1.0.0
 * @since 2016-04-20
 */
class AndroidAspectJXPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.repositories {
            mavenLocal()
        }

        project.dependencies {
            compile 'org.aspectj:aspectjrt:1.8.9'
        }

        project.extensions.create("sensorsAnalytics", AspectjExtension)

        if (project.plugins.hasPlugin(AppPlugin)) {
            //build time trace
            project.gradle.addListener(new TimeTrace())

            //register AspectTransform
            AppExtension android = project.extensions.getByType(AppExtension)
            android.registerTransform(new AspectTransform(project))
        }
    }
}
