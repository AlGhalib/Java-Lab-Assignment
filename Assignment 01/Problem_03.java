import java.lang.Math;
import java.util.Scanner;

public class Problem_03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("a   b   pow(a,b)");

        while(sc.hasNextLine())
        {
           	int a , b , c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = (int)Math.pow(a,b); //pow returns double, hence we typecast into integer

            System.out.println(a + "   " + b + "   " + c);
        }
    }
}

