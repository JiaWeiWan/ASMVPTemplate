package com.github.jiaweiwan.asmvvmtemplate.services

import com.github.jiaweiwan.asmvvmtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
