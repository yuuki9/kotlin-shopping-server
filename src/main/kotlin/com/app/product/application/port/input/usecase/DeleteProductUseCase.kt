package com.app.product.application.port.input.usecase

import com.app.product.domain.model.ProductId

interface DeleteProductUseCase {
    fun deleteProduct(productId: ProductId)
}