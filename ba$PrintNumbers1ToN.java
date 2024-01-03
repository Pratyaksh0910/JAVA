import java.util.Scanner;

public class ba$PrintNumbers1ToN {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value ");
    int n = sc.nextInt();
    sc.close(); 
    int counter = 1;   
    while (counter <= n) {
        System.out.println(counter);
        counter++;
    }
   } 
}
