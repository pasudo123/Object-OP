package edu.pasudo123.oop.elevator;

import edu.pasudo123.oop.elevator.impl.Person;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public interface IElevator {

    // 타다
    void takeOnPerson(Person person);

    // 내리다
    void getOffPerson(Person person);

    boolean isEmpty();

    // 위로 이동하다.
    void moveUp();

    // 아래로 이동하다.
    void moveDown();

    // 엘리베이터 문이 열린다.
    void openTheDoor();

    // 엘리베이터 문이 닫힌다.
    void closeTheDoor();

    // 현재 층 수를 유지한다.
    int getNowFloor();

    // 건물의 전체 층 수를 유지한다.

    // 버튼이 눌려졌다.
    void pressedTheButton();


}
