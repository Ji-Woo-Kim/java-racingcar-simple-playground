package domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {

    private static final int MOVE_THRESHOLD = 4;

    private final Random random;

    public RandomMovingStrategy(Random random) {
        this.random = random;
    }

    @Override
    public boolean isMovable() {
        return random.nextInt(10) >= MOVE_THRESHOLD;
    }
}
