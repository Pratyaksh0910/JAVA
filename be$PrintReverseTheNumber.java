import java.util.Scanner;

public class be$PrintReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be reversed ");
        int n = sc.nextInt();
        sc.close();
        //int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit );
            n = n / 10;
        }
        System.out.println();
    }
}
