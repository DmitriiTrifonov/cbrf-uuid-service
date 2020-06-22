package com.mitya1234.uuid

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class UuidApp

fun main(args: Array<String>) {
    SpringApplication.run(UuidApp::class.java, *args)
}