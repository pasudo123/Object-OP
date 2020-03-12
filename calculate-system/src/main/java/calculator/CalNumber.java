package calculator;

public class CalNumber {

    private int number;

    private CalNumber(int number){
        this.number = number;
    }

    public static CalNumber of(int number){
        return new CalNumber(number);
    }

    public int get(){
        return number;
    }
}
