package domain.car;

import domain.result.CarResult;

class Position {
    private int position = 0;
    private MoveStrategy strategy = new UpperFourMove();

    int move(int value) {
        if (strategy.isMove(value)) {
            position++;
        }
        return position;
    }

    public CarResult getResult(String name) {
        return new CarResult(name, position);
    }
}
