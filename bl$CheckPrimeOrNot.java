import java.util.*;
public class bl$CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N");
        int n = sc.nextInt();
        sc.close();
        if (n == 2) {
            System.out.println("N is prime");
        } else{
            boolean isPrime = true;
            for(int i = 2; i <= n-1; i++) {
                if (n % i == 0) { //n is not multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("N is prime");
            }
            else {
                System.out.println("N is not prime");
            }
        }
    }
}