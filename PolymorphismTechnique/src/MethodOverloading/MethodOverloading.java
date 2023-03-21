package MethodOverloading;

public class MethodOverloading {

    public int add(int x,int y){
        return x + y;
    }


    public int add(int x,float y){
        return x + (int) y;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    
}
