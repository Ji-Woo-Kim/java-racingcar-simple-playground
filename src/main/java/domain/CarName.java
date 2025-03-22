package domain;

public record CarName(String name) {
    private static final int MAX_LENGTH = 5;

    public CarName {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름으로 공백은 불가능합니다.");
        }
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }
}
