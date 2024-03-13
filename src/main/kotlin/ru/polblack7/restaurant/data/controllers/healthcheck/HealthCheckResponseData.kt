package ru.polblack7.restaurant.data.controllers.healthcheck

import ru.polblack7.restaurant.data.enums.ApplicationStatus
import java.util.*

class HealthCheckResponseData(
    val message: String, val status: ApplicationStatus, val version: String, val date: Date = Date(),
)