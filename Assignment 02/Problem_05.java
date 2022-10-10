import java.util.Scanner;

class MatProperties
{
    public boolean isScaler(int n , int[][] arr)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if((i != j && arr[i][j] != 0) || (i == j && arr[i][j] != 1)) return false;
            }
        }
        return true;
    }

    public boolean isSkewSym(int n , int[][] arr)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i][j] != (-1 * arr[j][i])) return false;
            }
        }
        return true;
    }
}

public class Problem_05
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of square matrix : ");
        int n;
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int x;
                x = sc.nextInt();
                arr1[i][j] = x;
            }
        }
        MatProperties myObj = new MatProperties();
        boolean ScM = myObj.isScaler(n, arr1);
        if(ScM) System.out.println("Given Matrix is Scaler");
        else System.out.println("Given Matrix is not Scaler");


        System.out.println("Enter the size of square matrix : ");
        int m;
        m = sc.nextInt();
        int[][] arr2 = new int[m][m];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int x;
                x = sc.nextInt();
                arr2[i][j] = x;
            }
        }
        boolean SsM = myObj.isSkewSym(n, arr2);
        if(SsM) System.out.println("Given Matrix is Skew Symmetric");
        else System.out.println("Given Matrix is not Skew Symmetric");
    }
}
