package com.example.todomain.common

import java.util.*

object Utils {
    fun generateUniqueString(): String {
        return UUID.randomUUID().toString()
    }
}