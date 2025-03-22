package domain;

import domain.generator.ControlRandomNumberGenerator;
import domain.generator.NumberGenerator;
import domain.strategy.MovingStrategy;
import domain.strategy.RandomMovingStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.OutputView;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingTest {

    private MovingStrategy movingStrategy;
    private OutputView outputView;
    private Cars cars;

    @BeforeEach
    void setting() {
        NumberGenerator inputGenerator = new ControlRandomNumberGenerator(5);
        MovingStrategy movingStrategy = new RandomMovingStrategy(inputGenerator);
    }

    @Test
    @DisplayName("모든 자동차가 동일한 위치라면 입력 받은 자동차 이름의 개수와 우승 자동차의 개수가 동일하다.")
    void test_multipleWinners() {
        NumberGenerator fixedGenerator = new ControlRandomNumberGenerator(10);
        MovingStrategy movingStrategy = new RandomMovingStrategy(fixedGenerator);

        Racing racing = new Racing(List.of("Car1", "Car2", "Car3"), movingStrategy, 2);
        racing.start();

        assertEquals(3, racing.getWinners().size()); // 3 대의 자동차 모두 우승
    }
}
