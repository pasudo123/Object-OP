package edu.pasudo123.oop.elevator;

import edu.pasudo123.oop.elevator.impl.Elevator;
import edu.pasudo123.oop.elevator.impl.ElevatorType;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class DemoApplication {

    public static void main(String[]args){

        ElevatorType type = ElevatorType.MEDIUM;
        Elevator elevator = new Elevator(type);

    }
}
