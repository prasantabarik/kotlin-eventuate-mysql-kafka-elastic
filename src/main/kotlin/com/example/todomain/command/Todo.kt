package com.example.todomain.command

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.*

@Entity
@Table(name = "todo")
@Access(AccessType.FIELD)
data class Todo (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = 0,

        var title: String? = "new",

        var completed: Boolean = false,

        var execution_order: Int? = 0
) {



}