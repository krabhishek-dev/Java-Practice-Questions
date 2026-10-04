// Take day and month and check if it forms a valid calendar date (ignoring leap years)
import java.util.Scanner;

public class ValidCalendar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day and month:");
        int date = sc.nextInt();
        int month = sc.nextInt();
        
        int maxDays = 0;

        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDays = 31;
                break;
            case 4, 6, 9, 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 28;
                break;
            default:
                maxDays = 0;
        }

        boolean isValidCalenderDate = ((date >= 1 && date <= maxDays) && (month >=1 && month <= 12));

        if(isValidCalenderDate){
            System.out.println("Valid Date and Month.");
        } else {
            System.out.println("Invalid! date and month.");
        }

        sc.close();
    }
}