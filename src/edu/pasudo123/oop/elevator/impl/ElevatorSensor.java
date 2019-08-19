package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IElevatorAlarm;
import edu.pasudo123.oop.elevator.IElevatorSensor;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class ElevatorSensor implements IElevatorSensor {

    private int limitWeight = 0;
    private int weight = 0;

    ElevatorSensor(final int maxWeight){
        this.limitWeight = maxWeight;
    }

    @Override
    public boolean beforeSensing() {
        return limitWeight <= weight;
    }

    @Override
    public boolean afterSensing() {
        return limitWeight <= weight;
    }

    @Override
    public boolean sensing() {
        return limitWeight <= weight;
    }

    @Override
    public void onBeforeAlarm() {
        System.out.println(":: 정원이 가득 찼습니다. ::");
    }

    @Override
    public void onAfterAlarm() {
        System.out.println(":: 정원이 가득 찼습니다. ::");
    }

    @Override
    public void addNewWeight(int personWeight) {
        this.weight += personWeight;
    }

    public void minWeight(int personWeight){
        this.weight -= personWeight;
    }
}
