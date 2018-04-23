package domain.player;

import domain.car.Cars;
import domain.result.RacingResult;

public class Player {
    private Cars cars;

    public Player(int carNum) throws IllegalArgumentException {
        cars = new Cars(carNum);
    }

    public void move(int amount) throws IllegalArgumentException {
        cars.move(amount);
    }

    public int getStockCarNum() {
        return cars.getStockCarNum();
    }

    public RacingResult getResults() {
        RacingResult results = new RacingResult();
        return cars.addResult(results);
    }
}
