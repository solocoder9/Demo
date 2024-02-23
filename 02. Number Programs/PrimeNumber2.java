import java.util.Scanner;

public class PrimeNumber2 {
    
    // Method to check the number is prime or not (Optimized)
    static boolean checkPrime(int n) {
        if(n <= 1) {
            return false;
        }
        else if(n == 2) {
            return true;
        }
        else if(n%2 == 0) {
            return false;
        }

        for(int i = 3; i <= Math.sqrt(n); i +=2) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if(checkPrime(n)) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
