import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // using a loop to find the first digit
        int firstDigit = 0;
        
        while(number != 0) {
            firstDigit = Math.abs(number % 10);
            number /= 10; 
        }

        System.out.println(firstDigit+" is the first digit of the enterd number.");

        sc.close();
    }
}
