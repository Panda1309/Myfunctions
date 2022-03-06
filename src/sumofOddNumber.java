import java.util.Scanner;
public class sumofOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number till you want to find sum ");
        int num= sc.nextInt();
        int res= sum(num);
        System.out.println("Sum of all odd numbers : "+res);
    }
    public static int sum(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}