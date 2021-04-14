package com.example.generate.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("hello/")
@RestController
class HelloController {
    @GetMapping("create")
    fun create(): String {
        return "hello"
    }
}
