package Method_Overrloading;

class AreaCalculator {

    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

public class TestArea {
    public static void main(String[] args) {

        AreaCalculator a = new AreaCalculator();

        System.out.println("Square Area: " + a.area(4));
        System.out.println("Rectangle Area: " + a.area(5, 6));
        System.out.println("Circle Area: " + a.area(3.5));
    }
}