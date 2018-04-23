package domain.car;

import domain.result.CarResult;
import domain.result.RacingResult;

class Position {
    private int position = 0;

    int move(int value) {
        if (value >= 4) {
            position++;
        }
        return position;
    }

    public CarResult getResult() {
        return new CarResult(position);
    }
}
