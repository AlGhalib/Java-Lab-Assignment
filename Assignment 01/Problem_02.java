import java.lang.Math;
import java.util.Scanner;

public class Problem_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float x1 , x2 , y1 , y2;
        System.out.println("Enter x1 and y1");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        System.out.println("Enter x2 and y2");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        // float a,b;a=Math.pow(x1,2);
        double dis = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println(dis);
    }
}
