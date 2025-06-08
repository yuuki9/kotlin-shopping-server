package com.app.domain.product.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.repository.ProductRepository
import com.app.product.application.port.input.usecase.Impl.CreateProductService
import com.app.product.domain.model.Price
import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductName
import com.app.product.domain.model.ProductStatus
import com.app.product.domain.validator.ProductPolicyValidator
import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.math.BigDecimal
import java.time.LocalDateTime


class CreateProductServiceTest {

    private lateinit var productRepository: ProductRepository
    private lateinit var productMapper: ProductMapper
    private lateinit var productPolicyValidator: ProductPolicyValidator
    private lateinit var target : CreateProductService
    @BeforeEach
    fun setup() {
        productRepository = mock()
        productMapper = ProductMapper(productPolicyValidator)
        productPolicyValidator = mock()
        target = CreateProductService(productRepository, productMapper)
    }
    @Test @DisplayName("CreateProductService - 상품 등록 성공테스트")
    fun testCreateProduct_positive() {
        // given
        val command = CreateProductCommand(
                name = "반팔 티셔츠",
                description = "여름용 의류",
                price = BigDecimal(10000),
                stockQuantity = 10,

        )

        val product = Product(
                name = ProductName("반팔 티셔츠"),
                description = "여름용 의류",
                price = Price(BigDecimal(10000)),
                stockQuantity = 10,
                status = ProductStatus.ON_SALE,
                createAt = LocalDateTime.now()
        )

        whenever(productMapper.toDomain(command)).thenReturn(product)
        whenever(productRepository.save(product)).thenReturn(product)

        // when
        val result = target.create(command)

        // then
        //행위 검증
        verify(productPolicyValidator).validate(command)
        verify(productMapper).toDomain(command)
        verify(productRepository).save(product)
        
        //상태 검증
        assertThat(result.name).isEqualTo(product.name)
        assertThat(product.status).isEqualTo(ProductStatus.ON_SALE)

    }

}