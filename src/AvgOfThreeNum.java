import java.util.Scanner;

public class AvgOfThreeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        float res=findAvg(num1,num2,num3);
        System.out.println(res);
    }
    public static float findAvg(int a,int b,int c)
    {
     float avg=((a+b+c)/3);
     return avg;
    }

}
