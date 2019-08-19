package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IElevator;
import edu.pasudo123.oop.elevator.IElevatorButton;
import edu.pasudo123.oop.elevator.IElevatorSensor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class Elevator implements IElevator {

    private final int ALL_FLOOR = 10;

    private ElevatorType type;
    private IElevatorButton button[];
    private IElevatorSensor sensor;
    private List<Person> personList;
    private int thisFloor;

    public Elevator(ElevatorType type) {
        this.type = type;
        this.sensor = new ElevatorSensor(type.getMaxWeight());
        this.personList = new ArrayList<>();
        this.thisFloor = 0;

        this.button = new IElevatorButton[ALL_FLOOR + 1];
        for (int i = 0; i < button.length; i++) {
            this.button[i] = new ElevatorButton();
        }
    }

    @Override
    public void takeOnPerson(Person person) {
        if (sensor.sensing()) {
            sensor.onBeforeAlarm();
            return;
        }

        this.personList.add(person);
        sensor.addNewWeight(person.getWeight());

        if (sensor.sensing()) {
            sensor.onAfterAlarm();
            /** while 문을 계속 돈다. **/
        }
    }

    @Override
    public void getOffPerson(Person person) {

        if (isEmpty()) {
            return;
        }

        this.personList.remove(person);
        sensor.minWeight(person.getWeight());
    }

    public boolean isEmpty() {
        return (this.personList.size() == 0);
    }

    @Override
    public void moveUp() {
        /** this.floor 보다 큰 층 수에 값이 true **/

        int goToFloor = 0;
        boolean isExist = false;

        for (int floor = this.thisFloor; floor <= ALL_FLOOR; floor++) {

            if (!button[floor].isPush()) {
                continue;
            }

            goToFloor = floor;
            isExist = true;
            break;
        }

        if (isExist) {
            thisFloor = goToFloor;
        }
    }

    @Override
    public void moveDown() {

    }

    @Override
    public void openTheDoor() {

    }

    @Override
    public void closeTheDoor() {

    }

    @Override
    public int getNowFloor() {
        return 0;
    }

    @Override
    public void pressedTheButton(final int floor) {
        this.button[floor].push();
    }
}
