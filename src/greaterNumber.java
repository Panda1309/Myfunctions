import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find largest number between them");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int larg=largNum(num1,num2);
        System.out.println("Largest number : "+larg);
    }
    public static int largNum(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
            return b;

    }
}
