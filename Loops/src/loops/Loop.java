package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Loop {

    public void generalOldForLoop() {

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        //

    }

    public void newForLoop() {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pine Apple");
        fruits.add("Grape");

        // for (int i = 0; i < fruits.size(); i++) {
        // System.out.println(fruits.get(i));
        // }

        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }

        //

    }

    public void labeledForLoop() {
        a: for (int i = 0; i < 3; i++) {
            System.out.println("I : " + i);
            b: for (int j = 0; j < 2; j++) {
                if (i == 1) {
                    break a;
                }
                System.out.println("J : " + j);

            }
        }
    }

    public void whileLoop(){
        int i = 0;
        while(true){
            System.out.println("I : "+ i);
            i++;
        }

    }

}
