// Take a 4-digit number and check if the first and last digits are equal.
import java.util.Scanner;

public class CompareFirstAndLastDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4-digit numbers: ");
        int number = scanner.nextInt();

        int digit1 = number / 1000 ;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        // System.out.println("Digits: " + digit1 + "\t" + digit2 + "\t" + digit3 + "\t" + digit4);
        if(digit1 == digit4 || digit4 == digit1){
            System.out.println("first and last digits are equal");
        } else {
            System.out.println("first and last digits are not equal");
        }

        scanner.close();
    }
}