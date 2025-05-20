package com.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinShoppingServerApplication

fun main(args: Array<String>) {
	runApplication<KotlinShoppingServerApplication>(*args)
}
