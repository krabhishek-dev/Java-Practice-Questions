// Take a day number (1–7) and print the corresponding day name.

import java.util.Scanner;

public class CheckDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter week day(1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Week Day 1: Sunday" );
                 break;
            case 2:
                System.out.println("Week Day 2: Monday" );
                break;
            case 3:
                System.out.println("Week Day 3: Tuesday" );
                break;
            case 4:
                System.out.println("Week Day 4: Wednesday" );
                break;
            case 5:
                System.out.println("Week Day 5: Thrusday" );
                break;
            case 6:
                System.out.println("Week Day 6: Friday" );
                break;
            case 7:
                System.out.println("Week Day 7: Saturday" );
                break;
            default:
                System.out.println("Please enter vaild day (1-7)!");
        }
    }

}