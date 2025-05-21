package com.app.product.application.port.output

import com.app.product.domain.Product
import com.app.product.domain.ProductId

interface ProductRepository {
    fun save(product: Product)
    fun findById(id: ProductId): Product?
}