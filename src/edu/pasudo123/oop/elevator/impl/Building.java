package edu.pasudo123.oop.elevator.impl;

import edu.pasudo123.oop.elevator.IElevator;
import edu.pasudo123.oop.elevator.IFloor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pasudo123 on 2019-08-19
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class Building {

    private String buildingName;
    private Floor[] floors;
    private List<Person> personList;
    private IElevator elevator;

    /** 빌딩 이름 설정 **/
    public void setBuildingName(final String buildingName){
        this.buildingName = buildingName;
    }

    /** 현재 빌딩의 전체 층 수 설정 **/
    public void setFloorSize(final int floorSize) {
        this.floors = new Floor[floorSize + 1];
        for (int i = 0; i < floors.length; i++) {
            this.floors[i] = new Floor();
        }
    }

    public String getBuildingName() {
        return buildingName;
    }

    public int getAllFloor(){
        return this.floors.length;
    }

    public void setPersonCountOnFloor(final int floor, int count){
        this.floors[floor].setPerson(count);
    }
}
