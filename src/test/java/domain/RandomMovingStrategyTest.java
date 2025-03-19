package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomMovingStrategyTest {

    private RandomMovingStrategy movingStrategy;

    @BeforeEach
    void setting() {
        //난수 값을 5로 고정시킨 후 테스트 진행
        NumberGenerator inputGenerator = new ControlRandomNumberGenerator(5);
        movingStrategy = new RandomMovingStrategy(inputGenerator);
    }

    @Test
    @DisplayName("4 이상의 값을 받은 isMovable()은 true를 반환한다.")
    void test_movingStrategy_isMovable() {
        assertTrue(movingStrategy.isMovable());
    }
}
