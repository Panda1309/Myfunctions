import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        boolean res=eligible(age);
        System.out.println(res);
    }
    public static boolean eligible(int age)
    {
if(age>18)
    return true;
else
    return false;
    }


}
