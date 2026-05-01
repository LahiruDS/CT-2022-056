package LW2;

public class Q1 {
    public static void main(String[] args) {

        double A = 2.0, B = 5.0, C = 3.0;
        double X = 8.0, Y = 2.0;
        double r = 7.0;

        double resultA = Math.sqrt(B * B + 4 * A * C);
        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        double resultC = Math.cbrt(X * Y);
        double area = Math.PI * r * r;

        System.out.printf("a. %.2f%n", resultA);
        System.out.printf("b. %.2f%n", resultB);
        System.out.printf("c. %.2f%n", resultC);
        System.out.printf("d. %.2f%n", area);
    }
}
