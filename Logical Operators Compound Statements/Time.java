// Take 24-hour time (hours and minutes) and print whether it is AM or PM.
public class Time {
    public static void main(String[] args){
        int hours = 14;
        int minutes = 30;

        if(hours < 12){
            System.out.println("AM");
        } else {
            System.out.println("PM");
        }
    }
}