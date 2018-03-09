import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ResultMessageBuilder {

    public static String build(ArrayList<Car> cars) {
        return buildResultMessage(cars) + buildWinnerNameMessage(cars);
    }

    private static String buildResultMessage(ArrayList<Car> cars) {
        StringBuilder builder = new StringBuilder();
        for (Car car : cars) {
            builder.append(car.getName())
                   .append(" : ")
                   .append(convertMessage(car.getCarPos()))
                   .append("\n");
        }
        return builder.toString();
    }

    static String convertMessage(int carPos) {
        char message = '-';
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < carPos; i++) {
            builder.append(message);
        }
        return builder.toString();
    }

    private static String buildWinnerNameMessage(ArrayList<Car> cars) {
        String message = "(이)가 최종 우승했습니다.";
        return getWinnersName(cars) + message;
    }

    static String getWinnersName(ArrayList<Car> cars) {
        if (!isExistNames(cars)) {
            return "없음";
        }
        Car[] winners = searchWinners(cars);
        return Arrays.stream(winners).map(Car::getName).collect(Collectors.joining(", "));
    }

    private static boolean isExistNames(ArrayList<Car> cars) {
        return cars.size() > 0;
    }

    static Car[] searchWinners(ArrayList<Car> cars) {
        int maxPosition = getMaxPosition(cars);
        ArrayList<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            addWinners(winners, car, maxPosition);
        }

        return winners.toArray(new Car[]{});
    }

    private static void addWinners(ArrayList<Car> winners, Car car, int maxPosition) {
        if (car.isMaxPosition(maxPosition)) {
            winners.add(car);
        }
    }

    static int getMaxPosition(ArrayList<Car> cars) {
        recordSort(cars);
        Car topRecordCar = cars.get(0);
        return topRecordCar.getCarPos();
    }

    static void recordSort(ArrayList<Car> cars) {
        Collections.sort(cars);
    }
}