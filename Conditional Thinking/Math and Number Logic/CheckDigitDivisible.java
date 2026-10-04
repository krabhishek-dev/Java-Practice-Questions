// Check if a number is a multiple of 7 or ends with 7
public class CheckDigitDivisible {
    public static void main(String[] args){
        int number = 7790;

        if(number % 7 == 0){
            System.out.println("Number is a multiple of 7.");
        }else {
            System.out.println("Number is not multiple of 7.");
        }
    }
}