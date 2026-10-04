// Take a password string and check basic rules (length ≥ 8 and contains at least one digit).
import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Password: ");
        String password = sc.nextLine();

        boolean hasDigit = false;

        for(int i = 0; i <  password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
                break;
            }
        }

        if(password.length() >= 8 && hasDigit){
            System.out.println("Strong Password.");
        } else {
            System.out.println("Weak Password.");
        }

        sc.close();
    }
}