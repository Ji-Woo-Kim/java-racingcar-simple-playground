package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Racing {

    List<Car> cars = new ArrayList<>();

    public void createCar(int carNum) {
        for(int i = 0; i < carNum; i++) {
            cars.add(new Car());
        }
    }

    public void startRacing(int roundNum) {
        for(int i = 0; i < roundNum; i++)
            round();
    }

    public void round() {
        for(Car car:cars) {
            Random random = new Random();
            int num = random.nextInt(9);
            car.moveCar(num);
        }
    }

    public List<Car> findWinner() {
        int maxPosition = findMaxPosition();
        return cars.stream().filter(c -> c.getPosition() == maxPosition).toList();
    }

    private int findMaxPosition() {
        List<Integer> positions = new ArrayList<>();
        for (Car car : cars) {
            positions.add(car.getPosition());
        }
        return Collections.max(positions);
    }

}
