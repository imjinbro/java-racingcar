package domain.car;

import domain.result.CarResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void move() {
        Car car = new Car();
        assertEquals(1, car.move(5));
    }

    @Test
    public void do_not_move() {
        Car car = new Car();
        assertEquals(0, car.move(2));
    }

    @Test
    public void print_result() {
        Car car = new Car();
        car.move(5);
        car.move(1);
        car.move(6);
        CarResult result = car.getResult("jinbro");
        assertEquals("--", result.getPositionMessage());
    }
}
