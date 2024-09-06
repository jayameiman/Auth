package com.demo.app.controller

import com.demo.app.service.UserService
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class UserController(
    var userService: UserService
) {

    @GetMapping("/")
    fun index() : String {
        return userService.UserLogin()
    }

    @PostMapping("/login")
    fun loginUser(): JSONPObject {
        return JSONPObject("callback", "Hello World")
    }
}