package com.example.todoapp_jetpack.Model

data class ToDo(
    var task: String ="",
    var date: String = "",
    var isUrgent : Boolean = false
){}
