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

    public Map<SeatType, Places> getSeats(){
        return Collections.unmodifiableMap(seats);
    }

    public void reserve(ReservationInfo reservationInfo){
        reservationInfo.updateReservationStatus(this);
    }

    public void cancel(String name){
        seats.values()
                .forEach(places -> places.removePlace(name));
    }

    public Places findPlacesBySeatType(SeatType seatType){
        return seats.get(seatType);
    }
}
