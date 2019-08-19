package edu.pasudo123.oop.elevator;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public interface IElevatorSensor {

    // 엘레베이터는 계속 감지한다.
    boolean beforeSensing();

    boolean afterSensing();

    boolean sensing();

    void addNewWeight(int personWeight);

    void onBeforeAlarm();

    void onAfterAlarm();

    void minWeight(int personWeight);

}
