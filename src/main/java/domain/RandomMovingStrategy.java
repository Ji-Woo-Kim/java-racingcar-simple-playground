package domain;

import java.util.Random;

public class RandomGenerateStrategy implements MovingStrategy {

    private static final int MOVE_THRESHOLD = 4;
    private static final Random random = new Random();

    @Override
    public boolean isMovable() {
        return random.nextInt(10) >= MOVE_THRESHOLD;
    }
}
