// Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin
import java.util.Scanner;

public class CheckPointsOnAxis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates(x, y):");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0 && y == 0){
            System.out.println("Point lies on X-axis.");
        }else if(y > 0 && x == 0){
            System.out.println("Point lies on Y-axis.");
        }else if((x > 0 && y > 0) || (x < 0 && y < 0)){
            System.out.println("Point lies in quadrant.");
        }else if((x > 0 && y < 0) || (x < 0 && y > 0)){
            System.out.println("Point lies in quadrant.");
        } else {
            System.out.println("Point lies on origin.");
        }

        sc.close();
    }
}