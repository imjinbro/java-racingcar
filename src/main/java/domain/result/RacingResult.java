package domain.result;

import java.util.Collections;
import java.util.LinkedList;

import static java.util.stream.Collectors.joining;

public class RacingResult {
    private LinkedList<CarResult> results = new LinkedList<>();

    public void add(CarResult result) {
        results.add(result);
    }

    public String getBoardMessage() {
        StringBuilder builder = new StringBuilder();
        for (CarResult result : results) {
            builder.append(result.getName());
            builder.append(" : ");
            builder.append(result.getPositionMessage());
            builder.append("\n");
        }
        return builder.toString();
    }

    public String getWinnerMessage() {
        Collections.sort(results);
        int maxPosition = results.getFirst().getPosition();
        return results.stream().filter(result -> result.isMatchMaxPosition(maxPosition)).map(CarResult::getName).collect(joining(", "));
    }
}
