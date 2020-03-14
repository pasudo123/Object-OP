package main.printer;

import main.reservation.Places;
import main.reservation.SeatType;

import java.util.Arrays;
import java.util.Map;

public class MenuResultView {

    private static final String SEAT_STATUS_FORMAT = "%s : %s";

    public static void showReservationStatus(Map<SeatType, Places> seats){
        for(SeatType type : seats.keySet()){
            Places places = seats.get(type);
            System.out.println(String.format(SEAT_STATUS_FORMAT,
                    type.name(),
                    Arrays.toString(places.convertToStringArray().toArray())));
        }
    }
}
