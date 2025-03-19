package application;

import domain.Car;
import domain.MovingStrategy;
import domain.Racing;
import domain.RandomMovingStrategy;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RacingCarApplication {

    public static void main(String[] args) {

        MovingStrategy movingStrategy = new RandomMovingStrategy();
        List<Car> winners;

        // 사용자 입력(n대의 자동차 이름, 라운드 횟수)
        final List<String> carNames = InputView.getCarNames();
        final int roundCount = InputView.getRoundCount();

        // 경주 시작 & 라운드 별 결과 출력
        OutputView.printResultMessage();
        Racing racing = new Racing(carNames, roundCount, movingStrategy);
        racing.start();

        // 최종 우승자 리스트 출력
        winners = racing.getWinners();
        OutputView.printWinners(winners);
    }
}
