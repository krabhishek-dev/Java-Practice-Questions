// Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours and minutes:");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        hours = hours % 12;

        double hourAngle = (hours * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("Smaller angle: " + angle + " degrees");

        sc.close();
    }
}