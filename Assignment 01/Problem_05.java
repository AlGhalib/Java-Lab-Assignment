import java.util.Scanner;

public class Problem_05
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Full Name : ");
        s = sc.nextLine();
        int len = s.length();
        int nos = 0;

        String str1 = "" , str2 = "" , str3 = "";

        for(int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ') nos++;
            if(ch != ' ' && nos == 0) str1 += ch;
            else if(ch != ' ' && nos == 1) str2 += ch;
            else if(ch != ' ' && nos == 2) str3 += ch;
        }
        System.out.println("First Name : " + str1);
        System.out.println("Middle Name : " + str2);
        System.out.println("Last Name : " + str3);
    }
}
