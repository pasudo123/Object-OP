package main.printer;

import main.reservation.SeatType;

import java.util.Scanner;

public class MenuInputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int askConcertMenu(){
        System.out.println("===  |  (1) 예약   |  (2) 조회  |  (3) 취소  |  (4) 끝내기  |  ===");
        return SCANNER.nextInt();
    }

    public static SeatType askSeatType(){
        SCANNER.nextLine();
        System.out.println("\n===> 예약할 좌석 타입을 선택해주세요.  |  (S) S type,  |  (A) A Type  |  (B) B Type  |");
        return SeatType.getSeatType(SCANNER.nextLine());
    }

    public static String askPersonName(){
        System.out.println("\n===> 예약할 사람의 이름을 입력해주세요.");
        return SCANNER.nextLine();
    }

    public static int askSeatPlace(){
        System.out.println("\n===> 예약할 좌석의 번호를 입력해주세요. ( 1 ~ 10 )");
        return SCANNER.nextInt();
    }

    public static String askCancelPersonName(){
        SCANNER.nextLine();
        System.out.println("\n===> 취소할 사람의 이름을 입력해주세요.");
        return SCANNER.nextLine();
    }
}
