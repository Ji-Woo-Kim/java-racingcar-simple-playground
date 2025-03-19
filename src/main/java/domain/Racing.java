package domain;

import view.OutputView;

import java.util.List;

public class Racing {

    private final Cars cars;
    private final int roundCount;
    private final MovingStrategy movingStrategy;

    public Racing(List<String> Names, int roundCount, MovingStrategy movingStrategy) {
        this.cars = new Cars(Names);
        this.roundCount = roundCount;
        this.movingStrategy = movingStrategy;
    }

    public void start() {
        for(int i = 0; i < roundCount; i++) {
            round();
        }
    }

    private void round() {
        cars.move(movingStrategy);
        OutputView.printRound(cars);
    }

    public List<Car> getWinners() {
        int maxPosition = findMaxPosition();
        return cars.getCars().stream()
                .filter(c -> c.getPosition() == maxPosition)
                .toList();
    }

    private int findMaxPosition() {
        return cars.getCars().stream()
                .mapToInt(Car::getPosition)
                .max().orElse(0);
    }
}
