// Take two angles of a triangle and compute the third angle
import java.util.Scanner;

public class ComputeTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        int side3 = 180 - (side1 + side2);

        System.out.println("Side1: " + side1);
        System.out.println("Side2: " + side2);
        System.out.println("Side3: " + side3);

        scanner.close();
    }
}