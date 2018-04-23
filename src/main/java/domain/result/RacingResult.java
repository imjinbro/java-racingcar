package domain.result;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RacingResult {
    private HashMap<String, CarResult> results = new HashMap<>();

    public void add(String name, CarResult result) {
        results.put(name, result);
    }

    public String makeViewMessage() {
        return makeBoardMessage() + makeWinnerMessage();
    }

    private String makeBoardMessage() {
        StringBuilder builder = new StringBuilder();
        Set<Map.Entry<String, CarResult>> resultSet = results.entrySet();
        for (Map.Entry<String, CarResult> result : resultSet) {
            builder.append(result.getKey());
            builder.append(" : ");
            builder.append(result.getValue().get());
            builder.append("\n");
        }
        return builder.toString();
    }

    private String makeWinnerMessage() {

        return null;
    }


}
