import java.util.Scanner;
public class largestBtnThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc. nextInt();

        // logic to find largest
        if(a >= b && a >= c) {
            System.out.println("a is largest");
        }
        else if(b >= c && b >= a) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }

        sc.close();
    }
}
