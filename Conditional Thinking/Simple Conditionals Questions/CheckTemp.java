// Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.

public class CheckTemp {
    public static void main(String[] args) {
        int temperature = 25; 

        if (temperature < 15) {
            System.out.println("Cold");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}
