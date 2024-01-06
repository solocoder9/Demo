import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Using Math.abs() to handle -ve numbers
        // Basicly it converts -ve numbers to +ve
        int lastDigit = Math.abs(number) % 10;
        
        System.out.println(lastDigit + " is the last digit of " + number);

        sc.close();
    }
}
