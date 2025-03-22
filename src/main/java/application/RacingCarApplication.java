package application;

import domain.*;
import domain.generator.NumberGenerator;
import domain.generator.RandomNumberGenerator;
import domain.strategy.MovingStrategy;
import domain.strategy.RandomMovingStrategy;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RacingCarApplication {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new RandomNumberGenerator();
        MovingStrategy movingStrategy = new RandomMovingStrategy(numberGenerator);

        // 사용자 입력(n대의 자동차 이름, 라운드 횟수)
        final List<String> carNames = InputView.scanCarNames();
        final int roundCount = InputView.scanRoundCount();

        // 경주 시작 & 라운드 별 결과 출력
        OutputView.printResultMessage(); // "실행 결과" 메시지 출력
        Racing racing = new Racing(carNames, movingStrategy, roundCount);
        racing.start();

        // 최종 우승자 리스트 출력
        OutputView.printWinners(Cars.getWinners());
    }
}
