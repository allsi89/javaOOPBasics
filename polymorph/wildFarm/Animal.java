import java.text.DecimalFormat;

public abstract class Animal {
    private static final int DEFAULT_FOOD_EATEN = 0;
    static final DecimalFormat DEFAULT_FORMAT = new DecimalFormat("#.##");

    private String animalType;
    private String animalName;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalType, String animalName, double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = DEFAULT_FOOD_EATEN;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    public void setFoodEaten(Food food) {
        this.foodEaten = this.getFoodEaten() + food.getQuantity();
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public abstract String toString();


}
