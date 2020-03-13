package main;

import calculator.Calculator;

public class ConsoleMain {
    public static void main(String[]args) {
        final String line = InputView.inputLine();
        Calculator calculator = Calculator.create();
        ResultView.printResult(calculator.calculate(line));
    }
}
