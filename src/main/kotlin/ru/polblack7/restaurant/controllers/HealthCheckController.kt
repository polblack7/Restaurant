package ru.polblack7.restaurant.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.polblack7.restaurant.data.controllers.healthcheck.HealthCheckResponseData
import ru.polblack7.restaurant.data.enums.ApplicationStatus

@RestController
class HealthCheckController {
    @GetMapping("/health-check")
    fun healthCheck(): ResponseEntity<HealthCheckResponseData> {
        return ResponseEntity.ok(HealthCheckResponseData("Ok", ApplicationStatus.UP, "1.0"))
    }
}