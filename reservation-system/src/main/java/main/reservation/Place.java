package main.reservation;

public class Place {
    private static final String DEFAULT_PLACE = "-----";
    private String place = DEFAULT_PLACE;

    public Place(){}

    public String get(){
        return place;
    }

    public String update(String place){
        this.place = place;
        return this.place;
    }

    public boolean isExist(String place){
        return this.place.equals(place);
    }

    public void init(){
        this.place = DEFAULT_PLACE;
    }
}
