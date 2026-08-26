// Take a 3-digit number and check if all digits are distinct.
import java.util.Scanner;

public class CheckDistinctNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3-digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 100) % 10;
        int digit3 = number % 10;

        if(digit1 != digit2 && digit1 != digit3 && digit2 != digit3 ){
            System.out.println("All digits are distinct");
        } else {
            System.out.println("All digits are not distinct");
        }

        scanner.close();
    }
}