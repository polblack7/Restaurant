package ru.polblack7.restaurant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestaurantApplication

fun main(args: Array<String>) {
    runApplication<ru.polblack7.restaurant.RestaurantApplication>(*args)
}