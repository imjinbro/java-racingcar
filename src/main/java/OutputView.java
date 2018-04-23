import domain.result.RacingResult;

public class OutputView {

    public static void printResult(RacingResult results) {
        System.out.println(results.makeViewMessage());
    }
}
