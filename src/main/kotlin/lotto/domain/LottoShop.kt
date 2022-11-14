package lotto.domain

import lotto.error.ErrorMessages

private typealias LottoShopError = ErrorMessages.LottoShopEnum

object LottoShop {

    const val UNIT_PRICE = 1_000
    const val MIN_VALUE = 1_000
    const val MAX_VALUE = 2_000_000_000

    val MoneyRange = MIN_VALUE..MAX_VALUE

    private fun checkValidMoney(money: Int) {
        require(money in MIN_VALUE..MAX_VALUE) { LottoShopError.OutOfRangeNumbers }
        require(money % UNIT_PRICE == 0) { LottoShopError.NotMultiple }
    }
}
