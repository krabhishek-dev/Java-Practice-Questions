// Check if one of two given numbers is a multiple of the other.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("One number is a multiple of the other.");
        } else {
            System.out.println("Neither number is a multiple of the other.");
        }

        sc.close();
    }
}