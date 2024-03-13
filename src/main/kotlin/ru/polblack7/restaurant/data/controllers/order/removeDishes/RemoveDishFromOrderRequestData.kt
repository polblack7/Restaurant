package ru.polblack7.restaurant.data.controllers.order.removeDishes

import ru.polblack7.restaurant.data.models.OrderPosition

data class RemoveDishFromOrderRequestData(
    val token: String?,
    val orderId: Int?,
    val orderList: List<OrderPosition>?,
)