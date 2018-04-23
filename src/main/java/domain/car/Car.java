package domain.car;

import domain.result.CarResult;

public class Car {
    private Position pos = new Position();

    public int move(int value) {
        return pos.move(value);
    }

    public CarResult getResult(String name) {
        return pos.getResult(name);
    }
}
