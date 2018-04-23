package domain.car;

import domain.result.RacingResult;

import java.util.ArrayList;

public class Cars {
    private ArrayList<Car> cars = new ArrayList<>();

    public Cars(int carNum) throws IllegalArgumentException {
        if (!isValidCarNum(carNum)) {
            throw new IllegalArgumentException("올바르지않은 자동차 대수 입니다.");
        }
        addCar(carNum);
    }

    private static boolean isValidCarNum(int carNum) {
        return carNum > 0;
    }

    private void addCar(int carNum) {
        for (int i = 0; i < carNum; i++) {
            cars.add(new Car());
        }
    }

    public void move(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("1번 이상 실행해야합니다.");
        }

        for (Car car : cars) {
            moveCar(amount, car);
        }
    }

    private void moveCar(int amount, Car car) {
        for (int i = 0; i < amount; i++) {
            car.move(getRandomValue());
        }
    }

    private int getRandomValue() {
        return RandomGenerator.generate();
    }

    public int getStockCarNum() {
        return cars.size();
    }

    public RacingResult addResult(RacingResult results) {
        for (Car car : cars) {
            results.add(car.getResult());
        }
        return results;
    }
}
