import java.util.Scanner;

public class circleCircumference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius=sc.nextFloat();
        float res=calculateCircumferance(radius);
        System.out.println("Circumferance of the circle is : "+res);
    }
    public static float calculateCircumferance(float r)
    {
        float cal =((2)*(22/7)*r);
        return cal;
    }

}
