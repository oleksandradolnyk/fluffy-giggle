package Homework5_24_10;

public class Dog {
    private String name;
    private int age;
    private String color;
    private double height;

    public Dog(String name, int age, String color, double height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        color = "black";
        height = 60;
    }

    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
