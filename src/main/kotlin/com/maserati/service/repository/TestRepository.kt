package com.maserati.service.repository

import com.maserati.service.TestEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface TestRepository : CrudRepository<TestEntity, Long>