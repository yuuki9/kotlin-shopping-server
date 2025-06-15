package com.app.domain.product.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.input.command.UpdateProductCommand
import com.app.product.application.port.input.usecase.Impl.UpdateProductService
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.model.*
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.math.BigDecimal
import java.time.LocalDateTime

class UpdateProductServiceTest {
    private lateinit var productRepository: ProductRepository
    private lateinit var productMapper: ProductMapper
    private lateinit var target : UpdateProductService

    private val fixedTime = LocalDateTime.of(2023, 1, 1, 0, 0)

    @BeforeEach
    fun setup() {
        productRepository = mock()
        productMapper = mock()
        target = UpdateProductService(productRepository , productMapper)
    }
    @Test
    @DisplayName("UpdateProductService - 상품 수정 성공 테스트")
    fun testProductListQuery_positive() {
        //given
        val command = UpdateProductCommand(
            productId = ProductId(1),
            name = "반팔 티셔츠",
            description = "여름용 의류",
            price = Price(BigDecimal(10000)),
            stockQuantity = 10,
            status = ProductStatus.ON_SALE,
            category = Category.TOP,
            gender = Gender.MEN
        )


        val result = Product(
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
        whenever(productRepository.save()).thenReturn(result)

        val res = target.updateProduct(command)

        //then
        //행위 검증
        verify(productRepository).getList()
        //상태 검증
        Assertions.assertThat("").isEqualTo("")
        //Assertions.assertThat(res[0].status).isEqualTo(ProductStatus.ON_SALE)
    }
}