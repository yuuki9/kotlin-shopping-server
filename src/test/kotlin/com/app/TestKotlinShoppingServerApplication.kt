package com.app

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<KotlinShoppingServerApplication>().with(TestcontainersConfiguration::class).run(*args)
}
