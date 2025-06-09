package com.app.product.application.port.input.usecase.Impl

import com.app.product.application.port.input.usecase.GetProductDetailUseCase
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductId

class GetProductDetailService(
    private val productRepository: ProductRepository
): GetProductDetailUseCase{
    override fun getProductDetail(productId: ProductId): Product? {
        return productRepository.findById(productId)
    }

}