package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IElevatorAlarm;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class ElevatorAlarm implements IElevatorAlarm {

    @Override
    public void onAlarm() {
        System.out.println(":: 정원이 초과되었습니다. ::");
    }

    @Override
    public void offAlarm() {

    }
}
