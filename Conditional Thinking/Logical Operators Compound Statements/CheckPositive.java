// Take two numbers and check if both are positive and their sum is less than 100.
import java.util.Scanner;

public class CheckPositive {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    if ((num1 > 0 && num2 > 0) && ((num1 + num2) < 100)) {
      System.out.println(
        "Both numbers are positive and their sum is less than 100."
      );
    } else if ((num1 > 0 && num2 > 0) && ((num1 + num2) > 100)) {
      System.out.println(
        "Both numbers are positive and but sum is more than 100."
      );
    } else if (num1 < 0 && num2 < 0) {
      System.out.println(
        "Both numbers are negative."
      );
    } else if (num1 > 0 && num2 < 0) {
        System.out.println(
        "Num1 is positive and Num2 is negative"
      );
    } else if (num1 < 0 && num2 > 0 ) {
        System.out.println(
        "Num1 is negative and Num2 is positive."
      );
    } else {
        System.out.println("Both number are zero.");
    }

    sc.close();
  }
}
