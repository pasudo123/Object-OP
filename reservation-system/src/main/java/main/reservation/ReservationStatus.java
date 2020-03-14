package main.reservation;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReservationStatus {
    private final static Map<SeatType, Places> seats = new LinkedHashMap<>();

    static {
        for(SeatType seatType : SeatType.values()){
            seats.put(seatType, Places.create());
        }
    }

    public static Map<SeatType, Places> getSeats(){
        return Collections.unmodifiableMap(seats);
    }
}
