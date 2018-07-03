public class Rebel extends Person {
    private static final int DEFAULT_FOOD_QUANTITY = 5;

    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void buyFood() {
        super.setFood(DEFAULT_FOOD_QUANTITY);
    }

}
