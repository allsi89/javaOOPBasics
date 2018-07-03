public class Citizen extends Person {
    private static final int DEFAULT_FOOD_QUANTITY = 10;

    private String id;
    private String birthDate;


    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age);
        this.id = id;
        this.birthDate = birthDate;
    }


    private void setId(String id) {
        this.id = id;
    }

    @Override
    public void buyFood() {
        super.setFood(DEFAULT_FOOD_QUANTITY);
    }
}
