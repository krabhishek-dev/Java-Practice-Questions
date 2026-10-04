// Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
import java.util.Scanner;

public class SumOfFirstAndLastDigit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a 3-digit number: ");
    int num = sc.nextInt();

    int first = num / 100;
    int middle = (num / 10) % 10;
    int last = num % 10;

    if (first + last == middle) {
      System.out.println(
        "Yes, the sum of the first and last digit equals the middle digit."
      );
    } else {
      System.out.println(
        "No, the sum of the first and last digit does not equal the middle digit."
      );
    }

    sc.close();
  }
}
