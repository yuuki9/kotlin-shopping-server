package com.app.product.application.service

import com.app.product.application.port.input.usecase.DecreaseStockUseCase
import com.app.product.application.port.output.ProductRepository

class DecreaseStockService(
    private val productRepository: ProductRepository
) : DecreaseStockUseCase {
}