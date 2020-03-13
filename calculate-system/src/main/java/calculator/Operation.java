package calculator;

@FunctionalInterface
public interface Operation {
    double calculate(CalNumber preNumber, CalNumber postNumber);
}
