package com.app.product.application.port.input.usecase.Impl

import com.app.product.application.port.input.usecase.DecreaseStockUseCase
import com.app.product.domain.repository.ProductRepository

class DecreaseStockService(
    private val productRepository: ProductRepository
) : DecreaseStockUseCase {
}