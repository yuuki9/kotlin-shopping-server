package com.app.product.application.port.input.command

import com.app.product.domain.model.ProductId

data class DecreaseStockCommand(
    val productId: ProductId,
    val quantity: Long
)