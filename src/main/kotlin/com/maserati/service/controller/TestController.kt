package com.maserati.service.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller("")
class TestController {
    @GetMapping("/test")
    fun testEndpoint(): ResponseEntity<Any> {
        return ResponseEntity.ok()
            .build()
    }
}