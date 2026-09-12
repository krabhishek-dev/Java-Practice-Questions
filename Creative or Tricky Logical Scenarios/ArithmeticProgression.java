// Take three numbers and check if they are in arithmetic progression. (B - A = C - B)
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values for a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = b - a;
        int y = c - b;

        if(x == y){
            System.out.println("They are in arithmetic progression.");
        } else {
            System.out.println("They are not in arithmetic progression.");
        }

        sc.close();
    }
}
