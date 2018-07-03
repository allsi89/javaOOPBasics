public abstract class Person implements Buyer {
    private String name;
    private int age;
    private int food;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.food = FOOD;
    }

    public void setFood(int food) {
        this.food += food;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
