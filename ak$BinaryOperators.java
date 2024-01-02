import java.util.*;
public class ak$BinaryOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Binary Operations
        System.out.println("Enter the value of A");
        float A = sc.nextFloat();
        System.out.println("Enter the value of B");
        float B = sc.nextFloat();
        System.out.println("The sum of A & B is " +(A + B));
        System.out.println("The sum of A & B is " +(A - B));
        System.out.println("The sum of A & B is " +(A * B));
        System.out.println("The sum of A & B is " +(A / B));
        System.out.println("The sum of A & B is " +(A % B));


        //Unary Operations
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    sc.close();    
    }
}