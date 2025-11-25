import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        double a, b, c, determinant, root1, root2, realPart, imaginaryPart;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        c = sc.nextDouble();

        determinant = b * b - 4 * a * c;
        
        if (determinant > 0) {
            // Two distinct real roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } 
        else if (determinant == 0) {
            // Two equal real roots
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root 1 = Root 2 = " + root1);
        } 
        else {
            realPart = -b / (2 * a);
            imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

