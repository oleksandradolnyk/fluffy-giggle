package Homework4_20_10;

public class Calc_homework_v2 {

    public static void main(String[] args) {

        double num1 = Methods.inputNumber();
        String symbol = Methods.inputSymbol();
        double num2 = Methods.inputNumber();

        Methods.result(num1, symbol, num2);

    }
}

