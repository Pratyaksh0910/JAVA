import java.util.*;
public class aj$AreaOfCircleByInput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius ");
      float radius = sc.nextFloat();
      double area = 3.14  * radius * radius;
      System.out.println("The area is ");; 
      System.out.println(area);
sc.close();  //always close scanner by writing same
    }
}