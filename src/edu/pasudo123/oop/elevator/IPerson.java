package edu.pasudo123.oop.elevator;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public interface IPerson {

    // 엘리베이터를 타다.
    void takeOnElevator();

    // 엘리베이터에서 내리다.
    void getOffElevator();

    // 버튼을 누른다.
    void pressTheButton();

    int getWeight();
}
