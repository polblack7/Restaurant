package ru.polblack7.restaurant.data.controllers.order.addDishes

import ru.polblack7.restaurant.data.models.OrderPosition

data class AddDishesToOrderRequestData(
    val token: String?,
    val orderId: Int?,
    val orderList: List<OrderPosition>?,
)