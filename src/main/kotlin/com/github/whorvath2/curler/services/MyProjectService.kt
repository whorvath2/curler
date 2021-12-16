package com.github.whorvath2.curler.services

import com.intellij.openapi.project.Project
import com.github.whorvath2.curler.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
