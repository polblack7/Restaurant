package ru.polblack7.restaurant

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.polblack7.restaurant.data.interfaces.RepositoryInterface
import ru.polblack7.restaurant.data.models.Dish
import ru.polblack7.restaurant.data.models.Order
import ru.polblack7.restaurant.data.models.User
import ru.polblack7.restaurant.data.repositories.DishRepository
import ru.polblack7.restaurant.data.repositories.OrderRepository
import ru.polblack7.restaurant.data.repositories.UserRepository

@Configuration
class Configuration {
    @Bean
    fun userRepository(): RepositoryInterface<User> {
        return UserRepository()
    }

    @Bean
    fun dishRepository(): RepositoryInterface<Dish> {
        return DishRepository()
    }

    @Bean
    fun orderRepository(): RepositoryInterface<Order> {
        return OrderRepository()
    }

}