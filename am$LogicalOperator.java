public class am$LogicalOperator {
    public static void main(String[]args) {
        //AND Operator
        //case1
        System.out.println( (3>2) && (5>0) );
        //case2
        System.out.println( (3>2) && (5<0) );
        //case3
        System.out.println( (3<2) && (5>0) );
        //case4
        System.out.println( (3<2) && (5<0) );


        //OR Operator
        //case1
        System.out.println( (3>2) || (5>0) );
        //case2
        System.out.println( (3>2) || (5<0) );
        //case3
        System.out.println( (3<2) || (5>0) );
        //case4
        System.out.println( (3<2) || (5<0) );


        //NOT Operator
        //case1
        System.out.println(!(3>2));
        //case2
        System.out.println(!(3<2)); 
  
    }
}