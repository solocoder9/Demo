import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Using a loop to find the sum of natural numbers
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural number is: " + sum);

        sc.close();
    }    
}
