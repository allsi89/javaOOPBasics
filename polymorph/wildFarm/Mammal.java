public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getAnimalType())
                .append("[")
                .append(super.getAnimalName())
                .append(", ")
                .append(DEFAULT_FORMAT.format(super.getAnimalWeight()))
                .append(", ")
                .append(this.livingRegion)
                .append(", ")
                .append(super.getFoodEaten())
                .append("]");

        return sb.toString();
    }
}
