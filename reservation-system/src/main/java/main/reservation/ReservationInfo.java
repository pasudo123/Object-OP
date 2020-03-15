package main.reservation;

public class ReservationInfo {

    private SeatType seatType;
    private String name;
    private int seatNumber;

    private ReservationInfo(SeatType seatType, String name, int seatNumber){
        this.seatType = seatType;
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public static ReservationInfo create(SeatType seatType, String name, int seatNumber){
        return new ReservationInfo(seatType, name, seatNumber);
    }

    public void updateReservationStatus(final ReservationStatus reservationStatus){
        final Places places = reservationStatus.findPlacesBySeatType(seatType);
        places.updatePlace(name, seatNumber);
    }
}
