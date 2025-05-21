package com.app.product.application.port.input.usecase

import com.app.product.domain.Product
import com.app.product.domain.ProductId

interface GetProductDetailUseCase {
    fun getProductDetail(productId: ProductId): Product?
}