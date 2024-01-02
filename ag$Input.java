import java.util.*;
public class ag$Input {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //To print only words without spcaing
            String input = sc.next();
            System.out.print(input);
            //To print whole line or spacing
            String name = sc.nextLine();
            System.out.println(name); 
            //To print number
            int number = sc.nextInt();
            System.out.println(number);
            //To print float value
            float price = sc.nextFloat();
            System.out.println(price); 
    sc.close(); //always close scanner by writing same       
        }
    } 
