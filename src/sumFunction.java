import java.util.Scanner;

public class sumFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int res= calculatemul(a,b);
        System.out.println("Multiplication is "+res);


    }
        public static int calculatemul(int num1,int num2)
    {
        int mul=num1*num2;
        return mul;
    }
}
