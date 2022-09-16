package com.example.versionplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        print(p0.allprojects + "1111111111111111")

    }
}