package Homework2_13_10;

import java.util.Scanner;

public class Simple_calc {
    public static void main(String[] args) {

        double num1, num2, result;
        String symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first digit: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter math symbol: ");
        symbol = scanner.next();

        System.out.println("Enter the second digit: ");
        num2 = scanner.nextDouble();

        switch (symbol){
            case "+":
                result = num1 + num2;
                System.out.println("Addition result: "+result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Subtraction result: "+result);
                break;
            case "*":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("You can not multiply by 0!");
                    break;
                }
                else {
                    result = num1*num2;
                    System.out.println("Multiplication result: "+result);
                    break;
                }
            case "/":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("You can not divide by 0!");
                    break;
                }
                else {
                    result = num1 / num2;
                    System.out.println("Division result: "+result);
                    break;
                }
            case "%":
                result = (num1 / num2)*100;
                System.out.println("First digit is "+result+"% from the second");
                break;

        }

    }
}
