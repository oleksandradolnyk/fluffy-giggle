package Homework4_20_10;

import java.util.Scanner;

public class Methods {
    static void division(double num1, double num2){ // ділення
        if (isNull(num1, num2)) {
            System.out.println("You can not divide by 0!");
        }
        else {
            double result = num1 / num2;
            System.out.println("Division result: " + result);
        }
    }

    static void addition(double num1, double num2){ // додавання
        double result = num1+num2;
        System.out.println("Addition result: "+ result);
    }

    static void multiplication(double num1, double num2){ // множення
        if (isNull(num1, num2)) {
            System.out.println("You can not multiply by 0!");
        }
        else {
            double result = num1*num2;
            System.out.println("Multiplication result: "+result);
        }
    }

    static void subtraction(double num1, double num2){  // віднімання
        double result = num1-num2;
        System.out.println("Subtraction result: " + result);
    }

    static void percentage(double num1, double num2){ // відсотки
        if (isNull(num1, num2)){
            System.out.println("You can not use zero as the argument in this operation.");
        }
        else {
            double result = (num1 / num2) * 100;
            System.out.println("First digit is "+result+"% from the second");
        }
    }

    static boolean isNull(double x, double y){
        if (x == 0 || y == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        double num = 0;
        try {
            num = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("It is not a digit.");
            System.exit(0);
        }
        return num;
    }

    public static String inputSymbol(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math symbol: ");
        String symbol = scanner.next();
        return symbol;
    }

    public static void result(double num1, String symbol, double num2){

        switch (symbol){
            case "+":
                addition(num1, num2);
                break;
            case "-":
                subtraction(num1, num2);
                break;
            case "*":
                multiplication(num1, num2);
                break;
            case "/":
                division(num1, num2);
                break;
            case "%":
                percentage(num1, num2);
                break;
            default:
                System.out.println("This math symbol does not exist.");
                break;
        }
    }
}
