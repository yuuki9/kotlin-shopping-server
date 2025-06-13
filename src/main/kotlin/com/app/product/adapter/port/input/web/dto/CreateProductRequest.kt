package com.app.product.adapter.port.input.web.dto

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.model.Category
import com.app.product.domain.model.Gender
import java.math.BigDecimal

data class CreateProductRequest(
    val name: String,
    val price: BigDecimal,
    val description: String,
    val stockQuantity: Long,
    val gender: String,
    val category: String
) {
    fun toCommand(): CreateProductCommand {
        return CreateProductCommand(
            name = name,
            price = price,
            description = description,
            stockQuantity = stockQuantity,
            gender = Gender.valueOf(gender.uppercase()),
            category =  Category.valueOf(category.uppercase())
        )
    }
}
