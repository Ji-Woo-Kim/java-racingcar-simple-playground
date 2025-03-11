package entity;

public class Car {

    String name;
    int position = 0;

    public int getPosition() {
        return position;
    }

    public void moveCar(int random) {
        if (random >= 4) {
            this.position += 1;
        }
    }
}
