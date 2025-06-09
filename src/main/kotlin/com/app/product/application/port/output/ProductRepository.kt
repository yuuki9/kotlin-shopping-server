package com.app.product.application.port.output

import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductId

interface ProductRepository {
    fun save(product: Product) : Product
    fun findById(id: ProductId): Product?
    fun getList() : List<Product>

    fun existsByName(name : String): Boolean


}