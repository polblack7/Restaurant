package ru.polblack7.restaurant.data.controllers.order.all

import ru.polblack7.restaurant.data.models.Order

data class GetOrdersResponseData(val message: String, val orders: List<Order>?)
