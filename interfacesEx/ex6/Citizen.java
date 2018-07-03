public class Citizen implements Detainable {

    private String name;
    private int age;
    private String id;
    private String birthDate;


    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }


    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
