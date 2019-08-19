package edu.pasudo123.oop.elevator.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pasudo123 on 2019-08-19
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class Floor{

    private List<Person> personList = new ArrayList<>();

    public void setPerson(final int personCount){
        for(int i = 0; i < personCount; i++){
            personList.add(new Person((i+1)));
        }
    }
}
