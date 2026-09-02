// Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
import java.util.Scanner;

public class CheckAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        if (amount % 100 == 0) {
            System.out.println("Amount can be evenly divided into ₹2000, ₹500, and ₹100 notes.");
        } else {
            System.out.println("Amount cannot be evenly divided into ₹2000, ₹500, and ₹100 notes.");
        }

        sc.close();
    }
}