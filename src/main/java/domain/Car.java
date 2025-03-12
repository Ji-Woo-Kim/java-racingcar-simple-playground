package domain;

public class Car {

    String name;
    int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void moveCar(int random) {
        if (random >= 4) {
            this.position += 1;
        }
    }

    public Boolean isWinner(int winningPosition) {
        return this.position == winningPosition;
    }
}
