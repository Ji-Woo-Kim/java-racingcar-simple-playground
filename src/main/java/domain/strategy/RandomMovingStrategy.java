package domain.strategy;

import domain.generator.NumberGenerator;

public class RandomMovingStrategy implements MovingStrategy {

    private static final int MOVE_THRESHOLD = 4;

    private final NumberGenerator numberGenerator;

    public RandomMovingStrategy(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public boolean isMovable() {
        return numberGenerator.generate() >= MOVE_THRESHOLD;
    }
}
