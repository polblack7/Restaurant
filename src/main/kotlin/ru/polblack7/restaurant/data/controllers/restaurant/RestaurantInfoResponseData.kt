package ru.polblack7.restaurant.data.controllers.restaurant

import ru.polblack7.restaurant.data.models.Restaurant

data class RestaurantInfoResponseData(val message: String, val restaurant: Restaurant? = null)
