package com.app.domain.product.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.usecase.Impl.CreateProductService
import com.app.product.application.port.input.usecase.Impl.GetProductDetailService
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.model.*
import com.app.product.domain.validator.ProductPolicyValidator
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.math.BigDecimal
import java.time.LocalDateTime

class GetProductDetailServiceTest {
    private lateinit var productRepository: ProductRepository
    private lateinit var target: GetProductDetailService

    @BeforeEach
    fun setup() {
        productRepository = mock()
        target = GetProductDetailService(productRepository)
    }

    @Test
    @DisplayName("GetProductListService - 상품 개별 조회 성공테스트")
    fun testProductDetail_positive() {
        //given
        val productId = ProductId(0)

        val fixedTime = LocalDateTime.of(2023, 1, 1, 0, 0)

        val product = Product(
            name = ProductName("반팔 티셔츠"),
            description = "여름용 의류",
            price = Price(BigDecimal(10000)),
            stockQuantity = 10,
            status = ProductStatus.ON_SALE,
            createAt = fixedTime,
            category = Category.TOP,
            gender = Gender.MEN
        )


        //when
        whenever(productRepository.findById(productId)).thenReturn(product)

        //then
        val res = target.getProductDetail(productId)

        //then
        verify(productRepository).findById(productId)
        //상태 검증
        Assertions.assertThat(product).isEqualTo(res)
        Assertions.assertThat(product.stockQuantity).isEqualTo(10)

    }
}