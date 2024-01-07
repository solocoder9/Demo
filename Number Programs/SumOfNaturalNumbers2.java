import java.util.Scanner;

public class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Using formula to find the sum of natural numbers
        int sum = (n * (n + 1)) / 2;

        System.out.println("Sum of natural number is: " + sum);

        sc.close();
    }
}
