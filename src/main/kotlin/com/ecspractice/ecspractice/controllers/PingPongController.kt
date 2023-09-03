package com.ecspractice.ecspractice.controllers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("ping")
class PingPongController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun pong(): String {
        return "pong"
    }
}
