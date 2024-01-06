import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        // Logic to check the enterd number is even or odd
        if(num % 2 == 0) {
            System.out.println(num+" is an even number");
        }
        else {
            System.out.println(num+" is an odd number");
        }

        sc.close();
    }
}
