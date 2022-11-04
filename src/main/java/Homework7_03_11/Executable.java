package Homework7_03_11;

public class Executable {
    public static void main(String[] args) {

        Lion lion = new Lion("Levi");
        Wolf wolf = new Wolf("Wolfie");

        lion.greets(); // Lion Levi says: Roar
        lion.hunting(); // Lion Levi goes hunting

        wolf.greets(); // Wolf Wolfie says: Hawoo
        wolf.hunting(); // Wolf Wolfie goes hunting
    }
}
