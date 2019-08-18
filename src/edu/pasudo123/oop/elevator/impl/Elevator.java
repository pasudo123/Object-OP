package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IElevator;
import edu.pasudo123.oop.elevator.IElevatorAlarm;
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

    private ElevatorType type;
    private IElevatorAlarm alarm;
    private IElevatorButton button;
    private IElevatorSensor sensor;
    private List<Person> personList;

    public Elevator(ElevatorType type){
        this.type = type;
        this.alarm = new ElevatorAlarm();
        this.button = new ElevatorButton();
        this.sensor = new ElevatorSensor(type.getMaxWeight());
        this.personList = new ArrayList<>();
    }

    @Override
    public void takeOnPerson(Person person) {
        if(sensor.beforeSensing()){
            /** 정원이 초과되었음에도 불구하고 또 탑승 **/

            alarm.onAlarm();
            return;
        }

        this.personList.add(person);
        sensor.addNewWeight(person.getWeight());

        if(sensor.afterSensing()){
            /** 탑승하고나서 정원이 초과되었음 :: Thread 로 3초 돌린다. 이후에 랜덤하게 한 명만 제외시킨다. **/
            alarm.onAlarm();
            System.out.println("정원이 초과되었습니다.");

            int localTime = 3000;

            while(true){
                try {

                    if(localTime == 0) { break; }

                    localTime -= 1000;
                    Thread.sleep(1000);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Override
    public void getOffPerson(Person person) {

        if(isEmpty()){
            return;
        }

        this.personList.remove(person);
        sensor.minWeight(person.getWeight());
    }

    public boolean isEmpty(){
        return (this.personList.size() == 0);
    }

    @Override
    public void moveUp() {

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
    public void pressedTheButton() {

    }
}
