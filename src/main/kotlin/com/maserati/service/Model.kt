package com.maserati.service

import javax.persistence.*


@Entity
data class TestEntity(
    @Id
    val id: Long? = null,
    val attribute: String
)