// Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.
import java.util.Scanner;

public class SumGreaterThanProduct {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer (1-9999): ");
    int num = sc.nextInt();

    int temp = num;
    int sum = 0;
    int product = 1;

    while (temp > 0) {
      int digit = temp % 10;
      sum += digit;
      product *= digit;
      temp /= 10;
    }

    if (sum > product) {
      System.out.println("Sum of digits is greater than product of digits.");
    } else {
      System.out.println(
        "Sum of digits is not greater than product of digits."
      );
    }

    sc.close();
  }
}
