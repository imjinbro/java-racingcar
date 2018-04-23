package domain.result;

import java.util.ArrayList;

public class RacingResult {
    private ArrayList<CarResult> results = new ArrayList<>();

    public void add(CarResult result) {
        results.add(result);
    }

    public String makeViewMessage() {
        StringBuilder builder = new StringBuilder();
        for (CarResult result : results) {
            builder.append(result.get());
            builder.append("\n");
        }
        return builder.toString();
    }
}
