package main;

import main.printer.MenuInputView;
import main.printer.MenuResultView;
import main.reservation.ReservationInfo;
import main.reservation.ReservationStatus;
import main.reservation.SeatType;

public class ReservationSystem {

    private static final int RESERVE = 1;
    private static final int SELECT = 2;
    private static final int CANCEL = 3;
    private static final int EXIT = 4;

    public static void run(){

        System.out.println("=================================");
        System.out.println("=======  공연 예약 시스템  =======");
        System.out.println("=================================");

        ReservationStatus reservationStatus = new ReservationStatus();

        while(true){
            final int myAnswer = MenuInputView.askConcertMenu();

            if(myAnswer == EXIT){
                break;
            }

            switch(myAnswer){
                case RESERVE :
                    final SeatType seatType = MenuInputView.askSeatType();
                    final String name = MenuInputView.askPersonName();
                    final int seatNumber = MenuInputView.askSeatPlace();
                    reservationStatus.reserve(ReservationInfo.create(seatType, name, seatNumber));
                    break;
                case SELECT :
                    MenuResultView.showReservationStatus(reservationStatus.getSeats());
                    break;
                case CANCEL :
                    final String cancelName = MenuInputView.askCancelPersonName();
                    reservationStatus.cancel(cancelName);
                    break;
                default:
                    break;
            }
        }

        System.out.println("=================================================");
        System.out.println("=======  공연 예약 시스템을 종료하였습니다.  =======");
        System.out.println("=================================================");
    }
}
