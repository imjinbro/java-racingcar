package domain.player;

import domain.car.Car;
import domain.result.RacingResult;

import static domain.player.RandomGenerator.generateRandomValue;

class Player {
    private PlayerName name;
    private Car car;

    Player(PlayerName name) {
        this.name = name;
        car = new Car();
    }

    void move(int amount) {
        for (int i = 0; i < amount; i++) {
            car.move(generateRandomValue());
        }
    }

    void addResult(RacingResult results) {
        results.add(car.getResult(name.getName()));
    }
}
