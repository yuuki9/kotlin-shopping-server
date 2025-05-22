package com.app.product.application.service

import com.app.product.application.port.input.command.GetProductListQuery
import com.app.product.application.port.input.usecase.GetProductListUseCase
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.Product

class GetProductListService(
        private val productRepository: ProductRepository
) : GetProductListUseCase {
    override fun getProductList(query: GetProductListQuery): List<Product> {
            return productRepository.getList()
    }
}