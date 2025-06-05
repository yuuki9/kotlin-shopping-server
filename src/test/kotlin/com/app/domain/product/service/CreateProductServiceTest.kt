package com.app.domain.product.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.*
import com.app.product.domain.validator.ProductPolicyValidator
import org.junit.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.mockito.Mock
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import java.math.BigDecimal
import java.time.LocalDateTime


class CreateProductServiceTest {

    private lateinit var productRepository: ProductRepository
    private lateinit var productMapper: ProductMapper
    private lateinit var productPolicyValidator: ProductPolicyValidator
    @BeforeEach
    fun setup() {
        productRepository = mock()
        productMapper = mock()
        productPolicyValidator = mock()
    }
    @Test @DisplayName("CreateProductService - 상품 등록 성공테스트")
    fun testCreateProduct_positive() {
        // given
        val command = CreateProductCommand(
                name = "상품명",
                description = "설명",
                price = BigDecimal(10000),
                stockQuantity = 10,

        )

        val product = Product(

        )
        // 임의의 Product 인스턴스 생성

        whenever(productMapper.toDomain(command)).thenReturn(product)
        whenever(productRepository.save(product)).thenReturn(product)

        val sut = CreateProductService(productRepository, productMapper, productPolicyValidator)

        // when
        sut.create(command)

        // then
        verify(productPolicyValidator).validate(command)
        verify(productMapper).toDomain(command)
        verify(productRepository).save(product)
    }
}