package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IFloor;

/**
 * Created by pasudo123 on 2019-08-19
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class Floor implements IFloor {

    private Person[] person;

    @Override
    public void setPerson(Person[] person) {
        this.person = person;
    }
}
