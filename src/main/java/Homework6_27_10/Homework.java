public class Homework {
    public static void main(String[] args) {

        Cat cat1 = new Cat(true, "carrot", 4, "white"),
                cat2 = new Cat(false, "meat", 4);

        System.out.println("Cat1 eats "+cat1.getEats()+" and is "+ cat1.getColor());
        System.out.println("Cat2 eats "+cat2.getEats()+" and is "+ cat2.getColor());

        cat2.setColor("red");

        System.out.println("Cat2 eats "+cat2.getEats()+" and is "+ cat2.getColor());

    }
}
