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
}
