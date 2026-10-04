import java.util.Scanner;

// Take two numbers and print largest number among them.
// class CheckLargestNumber {
//     public static void main(String[] args) {
//         int num1 = 30;
//         int num2 = 30;
//         int num3 = 30;

//         if (num1 > num2 && num1 > num3) {
//             System.out.println(num1 + " is the largest number.");
//         } else if (num2 > num1 && num2 > num3) {
//             System.out.println(num2 + " is the largest number.");
//         } else if(num3 > num1 && num3 > num2) {
//             System.out.println(num3 + " is the largest number.");
//         } else {
//             System.out.println("All numbers are equal.");
//         }
//     }
// }

class CheckLargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to compare? ");
        int n = sc.nextInt();

        System.out.print("Enter number 1: ");
        int largest = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println(largest + " is the largest number.");

        sc.close();
    }
}