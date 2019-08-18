package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IPerson;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class Person implements IPerson {

    private int weight;

    public Person(final int weight) {
        this.weight = weight;
    }

    @Override
    public void takeOnElevator() {

    }

    @Override
    public void getOffElevator() {

    }

    @Override
    public void pressTheButton() {

    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
