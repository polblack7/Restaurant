package ru.polblack7.restaurant.data.controllers.order.pay

data class PayOrderRequestData(
    val token: String?,
    val orderId: Int?,
)