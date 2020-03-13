package calculator;

public class CalNumber {

    private int number;

    private CalNumber(int number){
        this.number = number;
    }

    public static CalNumber of(String number){
        return new CalNumber(Integer.parseInt(number));
    }

    public double get(){
        return number;
    }
}
