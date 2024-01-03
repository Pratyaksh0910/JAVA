import java.util.Scanner;

public class av$PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks ");
        float marks = sc.nextFloat();
    sc.close();
        String type = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(type);
    }
}
