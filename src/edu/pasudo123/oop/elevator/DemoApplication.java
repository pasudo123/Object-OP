package edu.pasudo123.oop.elevator;

import edu.pasudo123.oop.elevator.impl.Building;
import edu.pasudo123.oop.elevator.impl.Elevator;
import edu.pasudo123.oop.elevator.impl.ElevatorType;
import edu.pasudo123.oop.elevator.impl.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pasudo123 on 2019-08-18
 * Blog: https://pasudo123.tistory.com/
 * Email: oraedoa@gmail.com
 **/
public class DemoApplication {

    private static Scanner scanner = new Scanner(System.in);
    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {

        List<Person> personList = null;
        boolean isContinue = true;

        while (isContinue) {

            /** # 1.0 **/
            builder.append("\n:: 엘리베이터 시스템에 오신걸 환영합니다. ::\n");
            builder.append("-- 빌딩 이름과 빌딩 층수를 입력해주세요. --");
            printingAndcleanUpBuilder();

            System.out.print("빌딩의 이름 :: ");
            String buildingName = scanner.next();

            System.out.print("빌딩의 층수 :: ");
            int buildingFloor = scanner.nextInt();

            Building building = new Building();
            building.setBuildingName(buildingName);
            building.setFloorSize(buildingFloor);

            /** # 2.0 **/
            builder.append("-- 빌딩에 들어오는 인원의 수를 입력해주세요. --");
            printingAndcleanUpBuilder();

            System.out.print("-- 인원의 수 :: ");
            int personCount = scanner.nextInt();
            personList = new ArrayList<>();
            for(int i = 0; i < personCount; i++){
                personList.add(new Person((i+1)));
            }

            /** # 2.1 :: 빌딩에 들어오는 인원의 몸무게 및 층수 입력 **/
            for(Person person : personList) {
                System.out.print("===============================================================\n");
                System.out.print("-- (" + person.getNumber() + ")번째 인원의 몸무게 :: ");
                int weight = scanner.nextInt();
                person.setWeight(weight);

                while (true) {
                    System.out.print("-- (" + person.getNumber() + ")번째 인원이 내리는 층수 :: ");
                    int takeOffFloor = scanner.nextInt();

                    // 존재하지 않는 층 수
                    if(takeOffFloor <= 0 || takeOffFloor > building.getAllFloor()) {
                        System.out.println("존재하지 않는 층 수를 입력하였습니다. !!");
                        continue;
                    }

                    person.setTakeOffFloor(takeOffFloor);
                    break;
                }// while(true)
            }// for
            System.out.print("===============================================================\n");
            System.out.print(":: 빌딩에 들어옹는 인원의 몸무게 및 층수를 모두 입력하셨습니다!! ::\n");
            System.out.print("===============================================================\n");

            /** # 3.0 :: 각 층에 존재하는 인원의 수 및 해당 인원이 가려고 하는 층 수 **/

        }
    }


    public static void printingAndcleanUpBuilder() {
        System.out.println(builder);
        builder.setLength(0);
    }
}
