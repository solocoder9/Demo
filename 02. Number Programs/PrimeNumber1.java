import java.util.Scanner;

public class PrimeNumber1 {
    
    // Method to check the number is prime or not
    static boolean checkPrime(int n) {

        if(n <= 1) {
            return false;
        }
        
        // Time complexity O(sqrt(n))
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if(checkPrime(n) == true) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
