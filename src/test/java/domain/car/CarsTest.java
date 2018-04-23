package domain.car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarsTest {

    @Test(expected = IllegalArgumentException.class)
    public void type_car_invalid_number_zero() {
        Cars cars = new Cars(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void type_car_invalid_number_negative() {
        Cars cars = new Cars(-1);
    }

    @Test
    public void type_car_valid_number() {
        Cars cars = new Cars(3);
        assertEquals(3, cars.getStockCarNum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void type_car_invalid_move_amount_zero() {
        Cars cars = new Cars(3);
        cars.move(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void type_car_invalid_move_amount_negative() {
        Cars cars = new Cars(3);
        cars.move(-10);
    }

    @Test
    public void type_car_valid_move_amount() {
        Cars cars = new Cars(3);
        cars.move(1);
    }
}
