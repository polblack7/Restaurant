package ru.polblack7.restaurant.data.controllers.order.place

import ru.polblack7.restaurant.data.models.OrderPosition

class PlaceOrderRequestData(
    val token: String?,
    val orderList: List<OrderPosition>?,
)
