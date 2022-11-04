package Homework7_03_11;

public class Lion extends Animal implements WildAnimal{

    public Lion(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Lion "+getName()+" says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Lion "+getName()+" goes hunting");
    }
}
