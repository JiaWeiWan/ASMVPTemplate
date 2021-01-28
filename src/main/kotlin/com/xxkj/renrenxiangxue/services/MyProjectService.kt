package com.xxkj.renrenxiangxue.services

import com.xxkj.renrenxiangxue.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
