// Program to print all the divisors of a number

import java.util.Scanner;

public class DivisorsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        System.out.print("Divisors of "+ number + ": ");

        // Logic to print all the divisors of a number
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }    
}
