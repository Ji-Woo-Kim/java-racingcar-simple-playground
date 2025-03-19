package application;

import domain.MovingStrategy;
import domain.Racing;
import domain.RandomMovingStrategy;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Random;

public class RacingCarApplication {

    public static void main(String[] args) {

        Random random = new Random();
        final MovingStrategy movingStrategy = new RandomMovingStrategy(random);

        // 사용자 입력(n대의 자동차 이름, 라운드 횟수)
        final List<String> carNames = InputView.getCarNames();
        final int roundCount = InputView.getRoundCount();

        // 경주 시작 & 라운드 별 결과 출력
        OutputView.printResultMessage(); // "실행 결과" 메시지 출력
        Racing racing = new Racing(carNames, movingStrategy, roundCount);
        racing.start();

        // 최종 우승자 리스트 출력
        OutputView.printWinners(racing.getWinners());
    }
}
