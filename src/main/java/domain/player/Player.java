package domain.player;

import domain.car.Car;
import domain.result.RacingResult;

import static domain.player.RandomGenerator.generateRandomValue;

public class Player {
    private PlayerName name;
    private Car car;

    public Player(PlayerName name) {
        this.name = name;
        car = new Car();
    }

    public void move(int amount) {
        for (int i = 0; i < amount; i++) {
            car.move(generateRandomValue());
        }
    }

    public void addResult(RacingResult results) {
        results.add(car.getResult(name.getName()));
    }
}
