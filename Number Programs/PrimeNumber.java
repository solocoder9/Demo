// Program to check the number is prime or not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int temp = 0;

        // Logic to check the number is Prime or not
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                temp++;
            }
        }

        if(temp == 0) {
            System.out.println(number + " is a Prime number");
        }
        else {
            System.out.println(number + " is not a Prime number");
        }

        sc.close();
    }    
}
