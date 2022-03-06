import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=0,p=0,z=0;
        while(t>0)
        {
            int num= sc.nextInt();
            if(num>0)
                p++;
            else if(num<0)
                n++;
            else
                z++;
            t--;
        }
        System.out.println("Positive = "+p);
        System.out.println("Negative = "+n);
        System.out.println("Zero = "+z);
    }
}
