package Inheritance;

public class Duck extends Animal {


    public void swim(){
        System.out.println("Swiming....");

    }

    public void layEggs(){
        System.out.println("My Egg..");
    }

    public void eat(){
        super.eat();
    }

   
    
}
