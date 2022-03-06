import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number :");
        int base= sc.nextInt();
        System.out.println("Enter the exponent number :");
        int exp= sc.nextInt();
        int res=power(base,exp);
        System.out.println("The power of "+base+ " to "+exp+" = "+res);
    }
    public static int power(int a,int b)
    {
        int expp=b;
        int res=1;
        while(b!=0)
        {
            res=res*a;
            --b;
        }
        return res;
    }
    }
