package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IElevatorButton;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class ElevatorButton implements IElevatorButton {

    private boolean isPush = false;

    public ElevatorButton() {
        this.isPush = false;
    }

    @Override
    public void push() {
        this.isPush = !this.isPush;
    }

    @Override
    public boolean isPush() {
        return this.isPush;
    }

}
