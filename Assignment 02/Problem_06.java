import java.util.Scanner;

public class Problem_06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10000; i++)
        {
            int sum = 0;

            for(int j = 1; j*j <= i; j++)
            {
                if(i % j == 0)
                {
                    if(j * j == i)
                    {
                        sum += j;
                    }
                    else
                    {
                        sum += j;
                        sum += (i / j);
                    }
                }
            }
            sum -= i;
            if(sum == i)
            {
                System.out.println(i +" is a perfect number");
            }
        }
    }
}
