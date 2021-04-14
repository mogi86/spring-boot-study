package com.example.generate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenerateApplication

fun main(args: Array<String>) {
	runApplication<GenerateApplication>(*args)
}
