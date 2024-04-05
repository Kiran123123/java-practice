package Polymorphism39;

public class PolymorphismExample{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        triangle.draw();
        square.draw();
    }
}
