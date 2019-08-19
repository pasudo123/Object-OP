package edu.pasudo123.oop.elevator;

import edu.pasudo123.oop.elevator.impl.Person;

/**
 * Created by pasudo123 on 2019-08-19
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public interface IBuilding {

    void updateBuildingName(String name);

    String getBuildingName();

    void intoBuilding(Person[]allPerson);

}
