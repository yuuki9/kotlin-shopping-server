package com.app.product.application.port.input.usecase

import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductId

interface GetProductDetailUseCase {
    fun getProductDetail(productId: ProductId): Product?
}