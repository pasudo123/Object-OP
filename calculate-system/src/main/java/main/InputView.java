package main;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputLine(){
        System.out.println("두 정수와 연산자를 입력해주세요. ex) 2 5 *");
        return SCANNER.nextLine();
    }
}
