import java.util.Scanner;

public class CheckGrade {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter marks: ");
      float marks = scanner.nextFloat();

      if (marks < 0 || marks > 100) {
        System.out.println("Invalid Marks!");
      } else if (marks >= 91) {
        System.out.println("Grade A+");
      } else if (marks >= 81) {
        System.out.println("Grade A");
      } else if (marks >= 71) {
        System.out.println("Grade B");
      } else if (marks >= 61) {
        System.out.println("Grade C");
      } else if (marks >= 40) {
        System.out.println("Grade D");
      } else {
        System.out.println("Grade F");
      }

      while (true) {
        System.out.print("Do you want to continue (y/n): ");
        char choice = scanner.next().charAt(0);

        if (choice == 'n' || choice == 'N') {
          scanner.close();
          System.out.println("Program Exit!");
          return;
        } else if (choice == 'y' || choice == 'Y') {
          break;
        } else {
          System.out.println("Invalid option! Please enter y or n.");
        }
      }
    }

  }
}
