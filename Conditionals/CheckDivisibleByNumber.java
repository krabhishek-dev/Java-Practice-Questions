class CheckDivisibleByNumber {
    public static void main(String[] args) {
        int number = 15;

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 5 and 3.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 3.");
        }
    }
}