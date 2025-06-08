package com.app.product.application.port.input.usecase.Impl

import com.app.product.application.port.input.command.GetProductListQuery
import com.app.product.application.port.input.usecase.GetProductListUseCase
import com.app.product.domain.repository.ProductRepository
import com.app.product.domain.model.Product

class GetProductListService(
        private val productRepository: ProductRepository
) : GetProductListUseCase {
    override fun getProductList(query: GetProductListQuery): List<Product> {
            return productRepository.getList()
    }
}