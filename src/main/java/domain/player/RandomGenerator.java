package domain.player;

import java.util.Random;

class RandomGenerator {
    private static final int BOUNDARY = 10;

    static int generateRandomValue() {
        return new Random().nextInt(BOUNDARY);
    }
}
