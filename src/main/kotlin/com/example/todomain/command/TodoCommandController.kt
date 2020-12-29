package com.example.todomain.command

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(path = ["/todos"])
class TodoCommandController(private val todoCommandService: TodoCommandService) {
//    @Autowired
//    lateinit var

    @RequestMapping(method = [RequestMethod.POST])
    fun create(@RequestBody createTodoRequest: CreateTodoRequest): CreateTodoResponse? {
        println(createTodoRequest.order)

        val todo: Todo? = todoCommandService.create(createTodoRequest)
        return CreateTodoResponse(todo?.id)
    }


    @RequestMapping(value = ["/{id}"], method = [RequestMethod.PUT])
    fun update(@PathVariable id: Long?, @RequestBody updateTodoRequest: UpdateTodoRequest?) {
        if (updateTodoRequest != null) {
            if (id != null) {
                todoCommandService.update(id, updateTodoRequest)
            }
        }
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.DELETE])
    fun delete(@PathVariable id: Long?) {
        if (id != null) {
            todoCommandService.delete(id)
        }
    }
}
