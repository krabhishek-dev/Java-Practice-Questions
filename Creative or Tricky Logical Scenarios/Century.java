// Take a year and print the corresponding century (e.g., “19th century”, “20th century”)
import java.util.Scanner;

public class Century {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = sc.nextInt();

    int century = (year - 1) / 100 + 1;

    System.out.println(century + "th century");

    sc.close();
  }
}
