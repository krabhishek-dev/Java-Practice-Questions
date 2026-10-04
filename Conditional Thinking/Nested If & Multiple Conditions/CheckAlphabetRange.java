// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

import java.util.Scanner;

public class CheckAlphabetRange {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter character: ");
    char ch = scanner.next().charAt(0);

    if (ch >= 'a' && ch <= 'm' ) {
      System.out.println("character between a and m: " + ch);
    } else if (ch >= 'n' && ch <= 'z') {
      System.out.println("character between n and z: " + ch);
    } else {
        System.out.println("Please enter valid charater (a-z)!");
    }
  }
}
