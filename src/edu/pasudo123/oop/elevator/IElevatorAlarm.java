package edu.pasudo123.oop.elevator;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public interface IElevatorAlarm {

    // 한 번 알람이 울린다.
    void onceAlarm();

    // 알람이 지속적으로 울린다.
    void continuousAlarm();

    // 경보가 울린다.
    void onAlarm();

    // 경보가 꺼진다.
    void offAlarm();

}
