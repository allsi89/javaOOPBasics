public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3.8);
        Shape rectangle = new Rectangle(5, 8.2);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
