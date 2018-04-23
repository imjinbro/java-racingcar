package domain.player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test(expected = IllegalArgumentException.class)
    public void type_car_invalid_number_zero() {
        Player player = new Player(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void type_car_invalid_number_negative() {
        Player player = new Player(-5);
    }

    @Test
    public void type_car_valid_number() {
        Player player = new Player(3);
        assertEquals(3, player.getStockCarNum());
    }
}
