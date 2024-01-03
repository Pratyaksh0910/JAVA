public class an$AssignmentOperator {
    public static void main(String[]args) {

        int A = 10;
        int B = 5;
        //case1
        System.out.println((A=B));
        //case2
        A+=10;
        System.out.println((A));
        //case3
        B-=5;
        System.out.println((B)); 
        //case4
        A*=10;
        System.out.println((A));
        //case5
        B/=5;
        System.out.println((B));
    }
}
