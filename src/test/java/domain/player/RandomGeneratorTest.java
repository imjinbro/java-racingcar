package domain.player;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RandomGeneratorTest {

    @Test
    public void generate_random() {
        for (int i = 0; i < 100; i++) {
            assertTrue(RandomGenerator.generate() < 10);
        }
    }
}
