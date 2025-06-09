package com.app.product.application.port.input.usecase.Impl

import com.app.product.application.port.input.command.DecreaseStockCommand
import com.app.product.application.port.input.command.RestoreStockCommand
import com.app.product.application.port.input.usecase.RestoreStockUseCase

class RestoreStockService :RestoreStockUseCase{
    override fun restoreStock(command: DecreaseStockCommand) {
        TODO("Not yet implemented")
    }

}