package com.app.product.adapter.port.output.persistence.repository

import com.app.product.adapter.port.output.persistence.mapper.ProductEntityMapper
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class ProductRepositoryImpl (
    private val jpaRepository : ProductEntityRepository,
    private val productEntityMapper : ProductEntityMapper
) : ProductRepository {
    override fun save(product: Product): Product {
        val entity = productEntityMapper.toEntity(product)
        jpaRepository.save(entity)
        return productEntityMapper.toDomain(entity)
    }

    override fun findById(id: ProductId): Product? {
        TODO("Not yet implemented")
    }

    override fun getList(): List<Product> {
        TODO("Not yet implemented")
    }

    override fun existsByName(name: String): Boolean {
        TODO("Not yet implemented")
    }
}