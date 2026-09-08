// Take three numbers and print the median value (neither maximum nor minimum).
import java.util.Scanner;

public class Median {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter three number: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    int median;

    if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
      median = num1;
    } else if (
      (num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)
    ) {
      median = num2;
    } else {
      median = num3;
    }

    System.out.print("Result: " + medium);

    sc.colse();
  }
}
