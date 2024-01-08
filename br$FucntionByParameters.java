import java.util.Scanner;

public class br$FucntionByParameters {
    public static int calculateSum(int a, int b) { //(int a, int b) are called parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        int sum = calculateSum(a , b); //(a , b) are called arguments or actual parameters
        System.out.println("Sum is " +sum);
        sc.close();
    }
}
