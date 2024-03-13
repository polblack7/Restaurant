package ru.polblack7.restaurant.data.controllers.dish.all

import ru.polblack7.restaurant.data.models.Dish

data class GetDishesResponseData(val message: String, val dishes: List<Dish>?)
