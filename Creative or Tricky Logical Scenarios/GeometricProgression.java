//  Take three numbers and check if they are in geometric progression. GP: b/a = c/b  or b^2 = a x c
import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a != 0 && b != 0 && c != 0 && (b*b == a * c)) {
            System.out.println("They are in geometric progression.");
        } else {
            System.out.println("Not in geometric progression.");
        }

        sc.close();
    }
} 