public class Basic {

    int num1;
    int num2;

    Basic() {

        System.out.println("I am Constructor : ");

    }

    Basic(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    // this method is for adddition of two values .....
    public Integer addition() {

        return  num1 + num2;

    }

}
