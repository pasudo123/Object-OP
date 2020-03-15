package main.reservation;

import java.util.stream.Stream;

public enum SeatType {
    S, A, B;

    public static SeatType getSeatType(final String paramSeatType){
        return Stream.of(values())
                .filter(seatType -> seatType.name().equals(paramSeatType))
                .findAny().orElseThrow(() -> new IllegalArgumentException("잘못된 좌석타입이 들어왔습니다."));
    }
}
