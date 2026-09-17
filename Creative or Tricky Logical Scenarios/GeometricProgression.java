//  Take three numbers and check if they are in geometric progression. GP: b/a = c/b  or b^2 = a x c
import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b*b == a * c) {
            System.out.println("They are in geometric progression.");
        } else {
            System.out.println("Not in geometric progression.");
        }

        sc.close();
    }
} 