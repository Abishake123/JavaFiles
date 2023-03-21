package Inheritance;

public class Cat extends Animal{

    @Override
    public void sleep(){
        System.out.println("Cat way of sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Cat way of eating");
    }

    public void bite(){
        System.out.println("Bites when we make them angry");
    }
    
}
