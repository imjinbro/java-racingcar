package domain.car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void move() {
        Position position = new Position();
        assertEquals(1, position.move(4));
    }

    @Test
    public void do_not_move() {
        Position position = new Position();
        assertEquals(0, position.move(1));
    }
}
