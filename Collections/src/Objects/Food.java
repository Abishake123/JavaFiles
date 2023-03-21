package Objects;

public class Food {


    private String foodName;

    private String foodColor;

    private Integer foodCost;

    private Integer foodCalories;

    public Food() {
    }

    public Food(String foodName, String foodColor, Integer foodCost, Integer foodCalories) {
        this.foodName = foodName;
        this.foodColor = foodColor;
        this.foodCost = foodCost;
        this.foodCalories = foodCalories;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodColor() {
        return foodColor;
    }

    public void setFoodColor(String foodColor) {
        this.foodColor = foodColor;
    }

    public Integer getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(Integer foodCost) {
        this.foodCost = foodCost;
    }

    public Integer getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(Integer foodCalories) {
        this.foodCalories = foodCalories;
    }

    @Override
    public String toString() {
        return "Food [foodCalories=" + foodCalories + ", foodColor=" + foodColor + ", foodCost=" + foodCost
                + ", foodName=" + foodName + "]";
    }

    
    
}
