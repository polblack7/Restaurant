package ru.polblack7.restaurant.controllers

import com.awazor.cinema.exception.RestaurantException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.polblack7.restaurant.data.controllers.test.FillMockResponseData
import ru.polblack7.restaurant.data.models.User
import ru.polblack7.restaurant.services.DishService
import ru.polblack7.restaurant.services.UserService

@RestController
class TestController(
    private val userService: UserService,
    private val dishService: DishService,
) {
    private val logger: Logger = LoggerFactory.getLogger(TestController::class.java)

    @PostMapping("/fill-mock-data")
    fun fillMockData(): ResponseEntity<FillMockResponseData> {
        return try {
            val token1 = userService.register("admin", "admin", true)
            val user1 = userService.getUser(token1)
            generateRandomDishes(user1, 10)
            val token2 = userService.register("user1", "1234", false)
            val user2 = userService.getUser(token2)
            val token3 = userService.register("user2", "4321", false)
            val user3 = userService.getUser(token3)
            logger.info("Mock data has been filled successfully")
            ResponseEntity.ok(
                FillMockResponseData(
                    "Тестовые данные были успешно добавлены",
                    listOf(user1, user2, user3)
                )
            )
        } catch (e: RestaurantException) {
            logger.error("Error during filling mock data: $e")
            ResponseEntity.badRequest().body(FillMockResponseData(e.message.toString()))
        } catch (e: Exception) {
            logger.error("Unknown error during filling mock data: $e")
            ResponseEntity.badRequest().body(FillMockResponseData("Произошла неизвестная ошибка"))
        }
    }


    private fun generateRandomDishes(user: User, count: Int) {
        val dishTitles = listOf("Burger", "Fish", "Steak", "Shwarma", "Cookies", "Medovik", "Milkshake")
        val dishDescriptions = listOf(
            "delicious", "tasty", "flavorful", "satisfying", "scrumptious",
            "mouthwatering", "appetizing", "savory", "delectable", "yummy"
        )
        for (i in 1..count) {
            val name = dishTitles.random()
            val description = dishDescriptions.random()
            val quantity = (1..100).random()
            val cookingTime = (1..5).random()
            val price = (10..1000).random().toDouble()
            dishService.addDish(user, name, description, quantity, cookingTime, price)
        }
    }
}
