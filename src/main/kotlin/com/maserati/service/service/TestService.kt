package com.maserati.service.service

import com.maserati.service.TestEntity
import com.maserati.service.repository.TestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class TestService {
    @Autowired
    private lateinit var testRepository: TestRepository


    fun getTestEntityBy(id: Long): TestEntity? {
        return testRepository.findById(id).orElseGet { null }
    }
}