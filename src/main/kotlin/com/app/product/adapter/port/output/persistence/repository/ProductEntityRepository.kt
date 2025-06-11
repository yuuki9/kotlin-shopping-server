package com.app.product.adapter.port.output.persistence.repository

import com.app.product.adapter.port.output.persistence.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductEntityRepository :JpaRepository<ProductEntity, Long> {
}