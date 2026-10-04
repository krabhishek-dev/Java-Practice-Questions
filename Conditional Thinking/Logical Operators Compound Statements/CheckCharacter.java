// Take a character and check if it is a letter, a digit, or neither
import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if(Character.isLetter(ch)){
            System.out.println("You entered Letter.");
        } else if(Character.isDigit(ch)){
            System.out.println("You entered Digit.");
        } else {
            System.out.println("Neither Letter nor Digit.");
        }

        scanner.close();
    } 
}