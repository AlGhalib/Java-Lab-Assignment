import java.util.Scanner;


class palindromes
{
    public boolean checkPal(int n)
    {
		/*
        String s = "";
        while(n > 0)
        {
            int p = n % 10;
            s += p;
            n /= 10;
        }
        */
/*
        String s = String.valueOf(n);   // String s = Integer.toString(n);

        int len = s.length();

        for(int i = 0 , j = len - 1; i < len / 2; i++ , j--)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
*/

		int rev_num = 0 , r;

		int orig_num = n;

        while (n != 0)
        {
		      r = n % 10;
		      rev_num = rev_num * 10 + r;
		      n /= 10;
   		}
   		if(orig_num == rev_num) return true;
   		else return false;
    }

}

public class Problem_04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        palindromes myObj = new palindromes();
        boolean flag = myObj.checkPal(n);
        if(flag) System.out.println(n +" is Palindrome");
        else System.out.println(n +" is not Palindrome");
    }
}
