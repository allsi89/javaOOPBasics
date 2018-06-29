public class Rectangle extends Shape {

    private double height;
    private double width;


    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    private double getHeight() {
        return this.height;
    }

    private double getWidth() {
        return this.width;
    }

    @Override
    public void calculateArea() {
        super.setArea(this.getHeight()*this.getWidth());
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(this.getHeight()*2 + this.getWidth()*2);
    }
}
