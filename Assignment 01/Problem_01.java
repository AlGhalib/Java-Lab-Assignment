import java.util.Scanner;

public class Problem_01
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int m;
        m = sc.nextInt();
        int y = m / (365 * 24 *60);
        int t = m % (365 * 24 * 60);
        int d = t / (60 * 24);
        System.out.println(m +" minutes is approximately "+ y +" years and "+ d +" days");
    }
}
