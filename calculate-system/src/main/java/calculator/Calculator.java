package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static final String WHITE_SPACE = "\\s";
    private static Map<Operator, Operation> operationSets;

    static{
        operationSets = new HashMap<Operator, Operation>(){{
            put(Operator.PLUS,      (preNumber, postNumber) -> preNumber.get() + postNumber.get());
            put(Operator.SUBTRACT,  (preNumber, postNumber) -> preNumber.get() - postNumber.get());
            put(Operator.DIVIDE,    (preNumber, postNumber) -> preNumber.get() / postNumber.get());
            put(Operator.MULTIPLY,  (preNumber, postNumber) -> preNumber.get() * postNumber.get());
        }};
    }

    private Calculator(){}

    public static Calculator create() {
        return new Calculator();
    }

    public double calculate(final String line){
        final String[] contents = preprocess(line);

        final CalNumber preNumber = CalNumber.of(contents[0]);
        final CalNumber postNumber = CalNumber.of(contents[1]);
        final String operator = contents[2];

        return operationSets.get(Operator.getOperator(operator))
                .calculate(preNumber, postNumber);
    }

    private String[] preprocess(final String line){
        return line.trim()
                .split(WHITE_SPACE);
    }
}
