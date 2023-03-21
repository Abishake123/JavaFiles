package ForLoop;

import java.util.ArrayList;
import java.util.List;

public class ForLooping {

    public void foorLoopMethod() {

        List<String> foods = new ArrayList<>();

        foods.add("Banana");
        foods.add("Apple");
        foods.add("Kiwi");

        // for (int i = 0; i < foods.size(); i++) {
        //     System.out.println(foods.get(i));
        // }

        // System.out.println("");

        for(String s : foods){
            System.out.println(s);
        }

    }

}
