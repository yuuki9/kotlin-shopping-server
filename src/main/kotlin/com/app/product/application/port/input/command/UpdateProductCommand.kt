package com.app.product.application.port.input.command

import com.app.product.domain.model.Price
import com.app.product.domain.model.ProductId
import com.app.product.domain.model.ProductStatus

data class UpdateProductCommand(
    val productId: ProductId,
    val name: String?,
    val price: Price?,
    val description: String?,
    val stockQuantity: Long?,
    val status: ProductStatus?
)