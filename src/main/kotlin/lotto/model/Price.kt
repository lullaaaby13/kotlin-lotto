package lotto.model

/**
 * 구앱 금액 관리 클래스
 * */
data class Price(
    private val value: Int?
) {
    init {
        require(value != null && value >= MIN_PRICE) { EXCEPTION_PRICE_NULL }
        require(value % MIN_PRICE == 0) { EXCEPTION_PRICE_FORMAT }
    }

    val price: Int = value ?: 0
    val lottoCount: Int = value?.div(MIN_PRICE) ?: DEFAULT_LOTTO_COUNT

    companion object {
        private const val DEFAULT_LOTTO_COUNT = 0
        private const val MIN_PRICE = 1000
        const val EXCEPTION_PRICE_NULL = ""
        const val EXCEPTION_PRICE_FORMAT = ""
    }
}