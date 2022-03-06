import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int gcd;
        for( gcd=(num1>num2)?num1:num2;gcd>=1;gcd--)
        {
            if (num1 % gcd == 0 && num2 % gcd == 0)
                break;

        }
        System.out.println(gcd);
    }
}
