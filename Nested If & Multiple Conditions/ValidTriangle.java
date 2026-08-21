// Take three sides and check if they form a valid triangle.
import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.println("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.println("Enter side 3: ");
        int side3 = scanner.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("Valid triangle");

            if (side1 == side2 && side2 == side3){
                System.out.println("Equilateral triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3){
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }

        } else {
            System.out.println("Invalid triangle");
        }
    }
}