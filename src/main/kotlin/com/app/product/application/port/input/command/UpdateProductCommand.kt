package com.app.product.application.port.input.command

import com.app.product.domain.Price
import com.app.product.domain.ProductId
import com.app.product.domain.ProductStatus

data class UpdateProductCommand(
        val productId: ProductId,
        val name: String?,
        val price: Price?,
        val description: String?,
        val stockQuantity: Long?,
        val status: ProductStatus?
)