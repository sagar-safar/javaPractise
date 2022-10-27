package operators;

public class operator {
    public static void main(String[] args) {

        // unary operator
        int a = 10;
        int b = a++;
        System.out.println(b);
        System.out.println(a);


        // relational operator
        System.out.println(1<2);


        //logical operator
        if(3>2 && 3>1){
            System.out.println("3 is greater");
        }
        

        if(3>2 || 3>4){
            System.out.println("3 is greater");
        }


        // bitwise operator
        System.out.println(1 & 0);
    }
    
}
