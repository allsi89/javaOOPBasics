public class Tiger extends Feline {
    private static final String DEFAULT_SOUND = "ROAAR!!!";
    private static final String DEFAULT_EAT_ERROR_MESSAGE = "Tigers are not eating that type of food!";

    private String livingRegion;

    public Tiger(String animalType, String animalName, double animalWeight, String livingRegion, String livingRegion1) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.livingRegion = livingRegion1;
    }

    @Override
    public void makeSound() {
        System.out.println(DEFAULT_SOUND);
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getName().equals("Meat")){
            super.setFoodEaten(food);
        } else {
            throw new IllegalArgumentException(DEFAULT_EAT_ERROR_MESSAGE);
        }
    }
}
