package edu.pasudo123.oop.elevator.impl;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public enum ElevatorType {

    SMALL(800), MEDIUM(1200), BIG(1550);

    private int maxWeight;

    ElevatorType(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight(){
        return this.maxWeight;

    }
}
