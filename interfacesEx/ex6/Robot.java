public class Robot implements Detainable {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBirthDate() {
        return null;
    }
}
