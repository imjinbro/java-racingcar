package io;

import domain.result.RacingResult;

public class OutputView {

    public static void printResult(RacingResult results) {
        System.out.println(results.getBoardMessage() + "\n" + results.getWinnerMessage() + "가 최종우승 했습니다.");
    }
}
