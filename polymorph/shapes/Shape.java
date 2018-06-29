public abstract class Shape {
    private double perimeter;
    private double area;

    Shape() {
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    void setArea(double area) {
        this.area = area;
    }


    public abstract void calculateArea();

    public abstract void calculatePerimeter();
}
