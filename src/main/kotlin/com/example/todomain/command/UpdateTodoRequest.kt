package com.example.todomain.command

data class UpdateTodoRequest(
        val title: String? = null,
        val completed: Boolean = false,
        val order: Int = 0) {
}