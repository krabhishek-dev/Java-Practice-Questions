// Take three numbers and check if they can form a Pythagorean triplet
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sqA = a*a;
        int sqB = b*b;
        int sqC = c*c;

        boolean isTriplet = (sqA + sqB == sqC) || (sqB + sqC == sqA) || (sqC + sqA == sqB );

        if(isTriplet){
            System.out.println("They Form Pythagorean triplet.");
        } else {
            System.out.println("Not Form Pythagorean triplet.");
        }

        sc.close();
    }
}