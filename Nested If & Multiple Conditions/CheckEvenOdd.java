// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

import java.util.Scanner;

public class CheckEvenOdd {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter two number: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    if (num1 % 2 == 0 && num2 % 2 == 0) {
      System.out.println("Both Even");
    } else if (num1 % 2 != 0 && num2 % 2 != 0) {
      System.out.println("Both Odd");
    } else {
        System.out.println("One Odd and One Even");
    }
  }
}
