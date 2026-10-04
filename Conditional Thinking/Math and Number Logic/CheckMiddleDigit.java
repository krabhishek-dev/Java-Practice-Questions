// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

import java.util.Scanner;

public class CheckDistinctNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3-digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if(digit2 > digit1 && digit2 > digit3){
            System.out.println("Middle digit is the largest");
        } else if(digit2 < digit1 && digit2 < digit3){
            System.out.println("Middle digit is the smallest ");
        } else {
            System.out.println("Middle digit is neither the largest nor the smallest");
        }

        scanner.close();
    }
}