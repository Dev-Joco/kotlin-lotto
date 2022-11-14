package lotto.ui

object Console {

    enum class Message(vararg args: String) {

        InputPurchaseAmount("구입금액을 입력해 주세요."),
        InputWinningNumbers("당첨 번호를 입력해 주세요."),
        InputBonusNumber("보너스 번호를 입력해 주세요."),

        ShowLotto("개를 구매했습니다."),
        ShowWinningStatistics(
            "당첨 통계",
            "---",
            "총 수익률은 ",
            "%입니다.",
        );

        val messages: List<String> = args.toList()

        override fun toString(): String = messages.joinToString("\n")
    }
}