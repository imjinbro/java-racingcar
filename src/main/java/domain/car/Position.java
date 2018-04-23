package domain.car;

import domain.result.CarResult;

class Position {
    private int position = 0;

    int move(int value) {
        if (value >= 4) {
            position++;
        }
        return position;
    }

    CarResult getResult() {
        return new CarResult(position);
    }
}