package domain.car;

import java.util.Random;

class RandomGenerator {
    private static final int BOUNDARY = 10;

    static int generate() {
        return new Random().nextInt(BOUNDARY);
    }
}
