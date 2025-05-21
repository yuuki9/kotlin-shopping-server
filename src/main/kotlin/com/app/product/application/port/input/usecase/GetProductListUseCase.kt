package com.app.product.application.port.input.usecase

import com.app.product.application.port.input.command.GetProductListQuery
import com.app.product.domain.Product

interface GetProductListUseCase {
    fun getProductList(query: GetProductListQuery): List<Product>
}