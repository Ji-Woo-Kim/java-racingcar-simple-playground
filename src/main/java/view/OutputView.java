package view;

import domain.Car;
import domain.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printRound(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(String.format("%s : %d", car.getName(), car.getPosition()));
        }
        System.out.println(); // 추가적인 공백 출력
    }

    public static void printWinners(final List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }
}
