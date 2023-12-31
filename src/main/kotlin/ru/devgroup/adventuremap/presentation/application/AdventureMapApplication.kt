package ru.devgroup.adventuremap.presentation.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdventureMapApplication

fun main(args: Array<String>) {
    runApplication<AdventureMapApplication>(*args)
}
