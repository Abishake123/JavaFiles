package Inheritance;

public class Kitten extends Cat {

    @Override
    public void sleep() {
        System.out.println("Kit way of sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Kit way of eating");
    }

    public void play() {
        System.out.println("Plays with yarn");
    }

}
