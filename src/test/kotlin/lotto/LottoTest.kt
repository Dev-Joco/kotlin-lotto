package lotto

import lotto.data.Lotto
import lotto.data.WinningLotto
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {

    @Test
    fun `로또판매점_가격에맞는수량_정상`() {
        TODO()
    }

    @Test
    fun `로또판매점_단위가격의배수가아님_에러`() {
        TODO()
    }

    @Test
    fun `로또생성기_생성_길이6`() {
        TODO()
    }

    @Test
    fun `로또생성기_생성_중복X`() {
        TODO()
    }

    @Test
    fun `로또생성기_생성_1to45`() {
        TODO()
    }

    @Test
    fun `로또_길이6_정상`() {
        Assertions.assertThat(Lotto(listOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun `로또_길이6아님_에러`() {
        assertSimpleThrows {
            Lotto(listOf(1, 2, 3, 4, 5, 6, 7))
        }
    }

    @Test
    fun `로또_중복X_정상`() {
        Assertions.assertThat(Lotto(listOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun `로또_중복O_에러`() {
        assertSimpleThrows {
            Lotto(listOf(1, 2, 3, 4, 5, 5))
        }
    }

    @Test
    fun `로또_숫자범위1to45_정상`() {
        Assertions.assertThat(Lotto(listOf(6, 4, 1, 10, 24, 45)))
    }

    @Test
    fun `로또_숫자범위벗어남_에러`() {
        assertSimpleThrows {
            Lotto(listOf(0, 3, 5, 6, 7, 8))
        }
        assertSimpleThrows {
            Lotto(listOf(1, 3, 5, 6, 45, 46))
        }
    }

    @Test
    fun `당첨번호_중복보너스숫자_에러`() {
        assertSimpleThrows {
            WinningLotto(listOf(1, 2, 3, 4, 5, 6), 3)
        }
    }


    private inline fun assertSimpleThrows(executable: () -> Unit) {
        val thrown = assertThrows<IllegalArgumentException>(executable)
        Assertions.assertThat(thrown.message).contains(ERROR_MESSAGE)
    }

    companion object {
        private const val ERROR_MESSAGE = "[ERROR]"
    }
}
