package domain.generator;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {

    private final static int RANDOM_BOUND = 10;

    private final Random random;

    public RandomNumberGenerator() {
        this.random = new Random();
    }

    @Override
    public int generate() {
        return random.nextInt(RANDOM_BOUND);
    }
}
