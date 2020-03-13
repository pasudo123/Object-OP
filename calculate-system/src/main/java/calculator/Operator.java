package calculator;

import java.util.stream.Stream;

public enum Operator {

    PLUS("+"),
    SUBTRACT("-"),
    DIVIDE("/"),
    MULTIPLY("*");

    private String operator;

    Operator(String operator){
        this.operator = operator;
    }

    public static Operator getOperator(String operator){
        return Stream.of(values())
                .filter(element -> element.operator.equalsIgnoreCase(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산기호 입니다."));
    }
}
