import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Calculate the sum of digits
        int sum = 0, digit = 0;

        while(number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of the digits is: " + sum);

        sc.close();
    }
}
