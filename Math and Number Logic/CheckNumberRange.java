// Check if a number lies within the range [100, 999].
import java.util.Scanner;

public class CheckNumberRange {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = scanner.nextInt();

    if (number >= 100 && number <= 999) {
      System.out.println("Entered number lies within the range [100, 999].");
    }else {
      System.out.println("Entered number is out of range.");
    }

    scanner.close();
  }
}
