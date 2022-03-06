import java.util.Scanner;
public class function1 {
    public static void main(String[] args) {

         String print =printMyName();
        System.out.println("Your name is "+print);
    }

    public static String printMyName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String str=sc.nextLine();
        return str;
    }
}
