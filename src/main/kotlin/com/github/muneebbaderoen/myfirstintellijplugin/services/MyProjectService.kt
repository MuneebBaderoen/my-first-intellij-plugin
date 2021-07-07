package com.github.muneebbaderoen.myfirstintellijplugin.services

import com.github.muneebbaderoen.myfirstintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
