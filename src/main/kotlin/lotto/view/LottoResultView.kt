package lotto.view

import lotto.infra.port.OutputSystem
import lotto.policy.LotteryPolicy
import lotto.vo.LotteryRank
import lotto.vo.LotterySet

class LottoResultView(private val outputSystem: OutputSystem) {

    fun printResult(lotterySet: LotterySet, winningNormalLottery: LotteryPolicy) {
        printHeadLine()
        staticalLottery(lotterySet, winningNormalLottery)
    }

    private fun printHeadLine() {
        outputSystem.write("당첨 통계\n")
        outputSystem.write("-------\n")
    }

    private fun staticalLottery(lotterySet: LotterySet, winningNormalLottery: LotteryPolicy) {
        LotteryRank
            .values()
            .filter { it != LotteryRank.NONE }
            .map { rank ->
                printLottery(rank, lotterySet, winningNormalLottery)
            }

        outputSystem.write("총 수익률은 ${lotterySet.rate(winningNormalLottery)}입니다.")
    }

    private fun printLottery(lotteryRank: LotteryRank, lotterySet: LotterySet, winningNormalLottery: LotteryPolicy) =
        // TODO: Builder pattern 으로 수정
        outputSystem
            .write("${lotteryRank.matchCount}개${specialRankInfix(lotteryRank)}일치(${lotteryRank.rewardMoney}원)-${getRankerNumber(lotteryRank, lotterySet, winningNormalLottery)}개\n")

    private fun getRankerNumber(lotteryRank: LotteryRank, lotterySet: LotterySet, winningNormalLottery: LotteryPolicy) =
        lotterySet.countPlace(winningNormalLottery, lotteryRank)

    private fun specialRankInfix(lotteryRank: LotteryRank) =
        if (lotteryRank == LotteryRank.BONUS_TWO_PLACE) ", 보너스 볼 " else " "
}