package Method_Overriding;

class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int length = 10;
        int width = 5;
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}