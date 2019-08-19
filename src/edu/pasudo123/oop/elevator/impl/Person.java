package edu.pasudo123.oop.elevator.impl;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class Person {

    private int number;
    private int takeOffFloor;
    private int weight;

    public Person() { }

    public Person(final int number) {
        this.number = number;
    }

    /** 현재 사람의 몸무게 표시 ( 엘리베이터 경고음을 위함 ) **/
    public void setWeight(final int weight) {
        this.weight = weight;
    }

    /** 현재 사람이 내리는 층 수 설정 **/
    public void setTakeOffFloor(final int floor) {
        this.takeOffFloor = floor;
    }

    public int getNumber() {
        return number;
    }

    int getWeight() {
        return weight;
    }

    int getTakeOffFloor() {
        return this.getTakeOffFloor();
    }
}
