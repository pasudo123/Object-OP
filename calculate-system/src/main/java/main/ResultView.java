package main;

public class ResultView {



    private static final String format = "결과는 %.2f 입니다.";

    public static void printResult(final Double result){
        System.out.println(String.format(format, result));
    }
}
