package main.reservation;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Places {

    private final List<Place> places;

    private Places(final int placeCount){
        this.places = IntStream.rangeClosed(1, placeCount)
                .mapToObj(i -> new Place())
                .collect(Collectors.toList());
    }

    public static Places create(){
        final int placeCount = 10;
        return new Places(placeCount);
    }

    public List<String> convertToStringArray(){
        return Collections.unmodifiableList(
                places.stream()
                .map(Place::get)
                .collect(Collectors.toList()));
    }

    public String updatePlace(String name, int seatNumber){
        validate(name, seatNumber);
        return places.get(getSeatNumber(seatNumber)).update(name);
    }

    public void removePlace(String name){
        places.stream()
                .filter(place -> place.isExist(name))
                .findAny()
                .ifPresent(Place::init);
    }

    private void validate(String name, int seatNumber){
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("예약자의 이름이 공백 또는 널입니다.");
        }

        if(seatNumber > places.size()){
            throw new IllegalArgumentException("예약 좌석의 번호가 존재하지 않습니다.");
        }
    }

    private int getSeatNumber(int seatNumber){
        return (seatNumber - 1);
    }
}
