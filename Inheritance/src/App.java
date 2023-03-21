import Inheritance.Dog;
import Inheritance.Duck;
import Inheritance.Pup;

public class App {
    public static void main(String[] args) throws Exception {
       
        Dog dog = new Dog();

        dog.bark();
        dog.eat();
        dog.sleep();
        

        Duck duck = new Duck();

        duck.layEggs();
        duck.swim();

        Pup pup = new Pup();

        pup.cry();
        pup.bark();
        pup.sleep();

    }
}
