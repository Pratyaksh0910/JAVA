import java.util.Scanner;

public class as$IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you income in lac");
        double income = sc.nextFloat();
    sc.close();    
        if (income < 500000) {
            double tax = 0;
            System.out.println("Tax you have to pay is " +tax);
        }
        else if (income >= 500000 && income <  1000000) {
            double tax = income * (0.2); 
            System.out.println("Tax you have to pay is " +tax);
        }
        else {
            double tax = income * (0.3); 
            System.out.println("Tax you have to pay is " +tax);
        }
    }
}
