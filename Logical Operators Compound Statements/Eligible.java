// Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        if(age > 18 && income > 500000){
            System.out.println("Eligible for tax.");
        } else {
            System.out.println("Not eligible for tax.");
        }

        sc.close();
    }
}