package com.app.product.application.port.input.usecase

import com.app.product.domain.ProductId

interface DeleteProductUseCase {
    fun deleteProduct(productId: ProductId)
}