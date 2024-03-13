package ru.polblack7.restaurant.data.controllers.restaurant

import ru.polblack7.restaurant.data.models.Order
import ru.polblack7.restaurant.data.models.Restaurant

data class RestaurantStatisticResponseData(
    val message: String,
    val restaurant: Restaurant? = null,
    val mostOrderedDishes: Map<Int, Int>? = null,
    val ordersSortedByRating: List<Order>? = null,
    val averageOrderPrice: Double? = null,
)
