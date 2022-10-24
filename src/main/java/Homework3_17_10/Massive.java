package Homework3_17_10;

public class Massive {
    public static void main(String[] args) {

        int sum = 0;

        int[] massive = new int[]{1, 3, 13, 15, 22, 23, 28, 29, 33, 35, 38, 48, 49, 52, 54, 57, 66, 74, 90, 91};

        for (int m : massive) {
            if (m >= 5 && m <= 45) {
                sum = sum + m;
            }
            if (m % 2 == 0) {
                System.out.println(m + " - even number"); //вывод только четных
            }
        }

        System.out.println("The sum of numbers from 5 to 45 is " + sum);

    }
}
