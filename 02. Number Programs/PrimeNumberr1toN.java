// Program to print prime numbers between 1 to N

import java.util.Scanner;

public class PrimeNumberr1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++) {
            int factorCount = 0;

            // check the number is prime or not
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    factorCount++;
                }                
            }

            if(factorCount == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }    
}
