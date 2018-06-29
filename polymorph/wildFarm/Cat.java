public class Cat extends Feline {
    private static final String DEFAULT_SOUND = "Meowwww";

    private String breed;

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(DEFAULT_SOUND);
    }

    @Override
    public void eat(Food food) {
       super.setFoodEaten(food);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getAnimalType())
                .append("[")
                .append(super.getAnimalName())
                .append(", ")
                .append(this.breed)
                .append(", ")
                .append(DEFAULT_FORMAT.format(super.getAnimalWeight()))
                .append(", ")
                .append(super.getLivingRegion())
                .append(", ")
                .append(super.getFoodEaten())
                .append("]");

        return sb.toString();
    }
}
