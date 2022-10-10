import java.util.Scanner;

class MatProperties
{
    public boolean isDiagonal(int n , int[][] arr)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j && arr[i][j] != 0) return false;
            }
        }
        return true;
    }

    public boolean isSymmetric(int m , int[][] arr)
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] != arr[j][i]) return false;
            }
        }
        return true;
    }
}

public class Problem_03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row/coloum size of a square matrix : ");
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

        boolean diag = myObj.isDiagonal(n, arr1);
        if(diag) System.out.println("Given Matrix is Diagonal");
        else System.out.println("Given Matrix is not Diagonal");


        System.out.println("Enter the row/colum size of a square matrix : ");
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
        boolean sym = myObj.isSymmetric(m, arr2);
        if(sym) System.out.println("Given Matrix is symmetrics");
        else System.out.println("Given Matrix is not symmetrics");
    }
}