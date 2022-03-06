import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int a=0,b=1,sum;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for(int i=1;i<num-1;i++)
        {
            sum=a+b;
            System.out.print(sum+"\t");
            a=b;
            b=sum;
        }
    }
}
