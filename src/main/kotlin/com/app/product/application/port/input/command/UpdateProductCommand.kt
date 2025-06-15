package com.app.product.application.port.input.command

import com.app.product.domain.model.*

data class UpdateProductCommand(
    val productId: ProductId,
    val name: String?,
    val price: Price?,
    val description: String?,
    val stockQuantity: Long?,
    val status: ProductStatus?,
    val gender : Gender,
    val category: Category
)