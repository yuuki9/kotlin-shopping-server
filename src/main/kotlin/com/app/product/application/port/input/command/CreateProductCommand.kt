package com.app.product.application.port.input.command

import com.app.product.domain.model.Category
import com.app.product.domain.model.Gender
import java.math.BigDecimal

data class CreateProductCommand(
        val name: String,
        val price: BigDecimal,
        val description: String,
        val stockQuantity: Long,
        val gender: Gender,
        val category: Category
)