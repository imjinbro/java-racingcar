package domain.player;

import domain.car.Car;
import domain.result.RacingResult;

public class Player {
    private PlayerName name;
    private Car car;

    public Player(PlayerName name) {
        this.name = name;
        car = new Car();
    }

    public void move(int amount) throws IllegalArgumentException {
        for (int i = 0; i < amount; i++) {
            car.move(RandomGenerator.generate());
        }
    }

    public void addResult(RacingResult results) {
        results.add(car.getResult());
    }
}
