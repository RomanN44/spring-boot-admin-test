package com.example.client.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/methods")
class Controller {
    @GetMapping("/hello")
    fun hello() = "Hello!"
}