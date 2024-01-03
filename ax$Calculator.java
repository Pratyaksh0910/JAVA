import java.util.*;

public class ax$Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value for A ");
            double a = sc.nextDouble();
            System.out.println("Enter value for B ");
            double b = sc.nextDouble();
            System.out.println("Enter value for operator");
            char operator = sc.next() .charAt(0); 
        sc.close();
            
        switch (operator) {
            case '+': System.out.println(a + b);
                break;
            case '-': System.out.println(a - b);
                break;
            case '*': System.out.println(a * b);
                break;
            case '/': System.out.println(a / b);
                break;
            case '%': System.out.println(a / b);
                break;
            default: System.out.println("Wrong Operator");
                break;
        }
        }
}
