package com.app.domain.product.service

import com.app.product.application.port.input.command.GetProductListQuery
import com.app.product.application.port.input.usecase.Impl.CreateProductService
import com.app.product.application.port.input.usecase.Impl.GetProductListService
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.model.Price
import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductName
import com.app.product.domain.model.ProductStatus
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.math.BigDecimal
import java.time.LocalDateTime

class GetProductListServiceTest {
    private lateinit var productRepository: ProductRepository
    private lateinit var target : GetProductListService
    @BeforeEach
    fun setup() {
        productRepository = mock()
        target = GetProductListService(productRepository)
    }
    @Test
    @DisplayName("GetProductListService - 상품 목록 조회 성공테스트")
    fun testProductListQuery_positive() {
        //given
        val query = GetProductListQuery(
            page = 0,
            size = 20,
            keyword = null
        )

        val fixedTime = LocalDateTime.of(2023, 1, 1, 0, 0)

        val result = listOf(
            Product(
                name = ProductName("반팔 티셔츠"),
                description = "여름용 의류",
                price = Price(BigDecimal(10000)),
                stockQuantity = 10,
                status = ProductStatus.ON_SALE,
                createAt = fixedTime
            )
        )

        //when
        whenever(productRepository.getList()).thenReturn(result)

        val res = target.getProductList(query)

        //then
        verify(productRepository).getList()
        //상태 검증
        Assertions.assertThat(result.size).isEqualTo(res.size)
        Assertions.assertThat(res[0].status).isEqualTo(ProductStatus.ON_SALE)
    }

    @Test
    @DisplayName("GetProductListService - 상품 목록 키워드 검색 성공테스트")
    fun testProductListQueryByKeyword_positive() {
        //given
        val query = GetProductListQuery(
            page = 0,
            size = 20,
            keyword = "반팔"
        )

        val fixedTime = LocalDateTime.of(2023, 1, 1, 0, 0)

        val result = listOf(
            Product(
                name = ProductName("반팔 티셔츠"),
                description = "여름용 의류",
                price = Price(BigDecimal(10000)),
                stockQuantity = 10,
                status = ProductStatus.ON_SALE,
                createAt = fixedTime
            )
        )
    }
}