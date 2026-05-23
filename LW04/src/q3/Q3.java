package Q3;

import java.util.Scanner;

class Circle {

    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = input.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);

        double shadedArea =
                outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area: " + shadedArea);

        input.close();
    }
}