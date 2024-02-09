import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Calculate the number of digits
        int count = 0;

        while(number > 0) {
            number = number / 10;
            count++;
        }

        System.out.println("The number of digits is: " + count);

        sc.close();
    }
}
