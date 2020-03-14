package main.printer;

import java.util.Scanner;

public class MenuInputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int askConcertMenu(){
        System.out.println("===  |  (1) 예약   |  (2) 조회  |  (3) 취소  |  (4) 끝내기  |  ===");
        return SCANNER.nextInt();
    }
}
