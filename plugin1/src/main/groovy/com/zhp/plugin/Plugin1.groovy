package com.zhp.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.AppExtension
class Plugin1 implements Plugin<Project> {

    void apply(Project project) {
        println "this is first gradle plugins"
        System.out.println("this is first gradle plugins too");
        def android = project.extensions.getByType(AppExtension)
        def transform = new Transform1(project)
        android.registerTransform(transform)
    }
}