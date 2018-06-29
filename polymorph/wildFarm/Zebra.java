public class Zebra extends Mammal {
    private static final String DEFAULT_SOUND = "Zs";
    private static final String DEFAULT_EAT_ERROR_MESSAGE = "Zebras are not eating that type of food!";


    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(DEFAULT_SOUND);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getName().equals("Vegetable")){
            super.setFoodEaten(food);
        } else {
            throw new IllegalArgumentException(DEFAULT_EAT_ERROR_MESSAGE);
        }
    }
}
