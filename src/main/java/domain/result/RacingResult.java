package domain.result;

import java.util.ArrayList;

public class RacingResult {
    private ArrayList<CarResult> results = new ArrayList<>();

    public void add(CarResult result) {
        results.add(result);
    }
}
