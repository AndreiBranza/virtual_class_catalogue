package main;

public enum Subject {
    MATH(0), ENGLISH(1), HISTORY(2), BIOLOGY(3), GEOGRAPHY(4);

    private final int code;

    Subject(int code) {
        this.code = code;
    }

    static Subject getSubject(int code) {
        return switch (code) {
            case 0 -> MATH;
            case 1 -> ENGLISH;
            case 2 -> HISTORY;
            case 3 -> BIOLOGY;
            case 4 -> GEOGRAPHY;
            default -> MATH;
        };
    }
}
