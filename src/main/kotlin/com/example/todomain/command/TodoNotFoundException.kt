package com.example.todomain.command

class TodoNotFoundException(id: Long?) : RuntimeException(String.format("Todo with id=%s not found"))