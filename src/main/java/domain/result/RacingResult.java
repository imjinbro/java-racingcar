package domain.result;

import java.util.ArrayList;

public class RacingResult {
    private ArrayList<CarResult> results = new ArrayList<>();

    public void add(CarResult result) {
        results.add(result);
    }

    public String makeViewMessage() {
        return makeBoardMessage() + makeWinnerMessage();
    }

    private String makeBoardMessage() {
        StringBuilder builder = new StringBuilder();
        for (CarResult result : results) {
            builder.append(result.getName());
            builder.append(" : ");
            builder.append(result.getPositionMessage());
        }
        return builder.toString();
    }

    private String makeWinnerMessage() {

        return null;
    }


}
