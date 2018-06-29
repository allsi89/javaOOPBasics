public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }


    private final double getRadius() {
        return this.radius;
    }

    @Override
    public void calculateArea() {
        super.setArea(Math.PI * this.getRadius() * this.getRadius());
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.getRadius());
    }
}
