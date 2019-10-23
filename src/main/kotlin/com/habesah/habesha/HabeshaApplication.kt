package com.habesah.habesha

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = arrayOf(SecurityAutoConfiguration::class))
class HabeshaApplication

fun main(args: Array<String>) {
	runApplication<HabeshaApplication>(*args)
}
