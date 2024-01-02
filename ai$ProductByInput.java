import java.util.*;
public class ai$ProductByInput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first value ");
      int a = sc.nextInt();
      System.out.println("Enter the second value ");
      int b = sc.nextInt();
      System.out.println("The product is ");
      int product = a * b; 
      System.out.println(product);
sc.close();  //always close scanner by writing same
    }
}