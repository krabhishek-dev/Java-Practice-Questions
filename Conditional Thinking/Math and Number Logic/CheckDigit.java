// Check whether a given integer is single-digit, double-digit, or multi-digit
import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your digit: ");
        int number = scanner.nextInt();

        if(number >= 0 && number <= 9){
            System.out.println("SIngle-digit");
        }else if(number > 9 && number <= 99){
            System.out.println("Double-digit");
        }else if(number > 99 ){
            System.out.println("Multi-digit");
        }else {
            System.out.println("Invalid input!! Enter number only.");   
        }

        scanner.close();
    }
}