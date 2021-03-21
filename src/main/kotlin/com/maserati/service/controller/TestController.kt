package com.maserati.service.controller

import com.maserati.service.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@Controller("")
class TestController {
    @Autowired
    private lateinit var testService: TestService


    @GetMapping("/test/{testEntityId}")
    fun testEndpoint(
        @PathVariable testEntityId: Long
    ): ResponseEntity<Any> {
        return ResponseEntity.ok(testService.getTestEntityBy(testEntityId))
    }
}