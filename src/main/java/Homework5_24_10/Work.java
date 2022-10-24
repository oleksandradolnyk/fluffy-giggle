package Homework5_24_10;

public class Work {
    public static void main(String[] args) {
        Dog betty = new Dog("Betty", 5);

        System.out.println("OLD "+betty.getAge());
        System.out.println("OLD "+betty.getColor());

        betty.setAge(9);
        betty.setColor("white");

        System.out.println("NEW "+betty.getAge());
        System.out.println("NEW "+betty.getColor());
    }
}
