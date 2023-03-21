package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Objects.Food;

public class ArrayListCollection {

    private Integer value = 2;
    private ArrayList<Integer> arrayList = new ArrayList<>();
    
    public void arrayListRun() {

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.remove(3);

        System.out.println("Arrat List : " + arrayList);
    
            // Food food ;

            // food = new Food();
            // food.setFoodName("Idli");
            // food.setFoodColor("white");
            // food.setFoodCalories(100);
            // food.setFoodCost(6);
            // arrayList.add(food);

            // food = new Food();
            // food.setFoodName("Dosa");
            // food.setFoodColor("Brown & White");
            // food.setFoodCalories(60);
            // food.setFoodCost(10);
            // arrayList.add(food);

            
            // System.out.println("ArrayList : " + arrayList);
        
        
    }

}
