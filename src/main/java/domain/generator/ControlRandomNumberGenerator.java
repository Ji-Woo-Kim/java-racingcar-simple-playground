package domain.generator;

public class ControlRandomNumberGenerator implements NumberGenerator {

    private final int inputValue;

    public ControlRandomNumberGenerator(int inputValue) {
        this.inputValue = inputValue;
    }

    @Override
    public int generate() {
        return inputValue;
    }
}
