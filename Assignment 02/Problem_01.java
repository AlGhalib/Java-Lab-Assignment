import java.util.Scanner;

public class Problem_01 
{
    public static int classifyChar(char c)
    {
        // char[] arr = {'a', 'e', 'i', 'o', 'u' , 'A' , 'E','I','O' , 'U'};
        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(c == arr[i]) return 0;
        // }
        
        String s = "aeiouAEIOU";

        if(s.indexOf(c) != -1) return 0;

        if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) return 1 ;
		if ('0' <= c && c <= '9') return 2 ;
		return 3 ;
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        int vow = 0 , cons = 0 , num = 0 , spec = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int res = classifyChar(s.charAt(i));
			if (res == 0) vow++ ;
			else if (res == 1) cons++ ;
			else if (res == 2) num++ ;
			else spec++;
        }
        System.out.println("Vowel Count : " + vow );
		System.out.println("Consonent Count : " + cons );
		System.out.println("Numeric Count : " + num );
		System.out.println("Special Count : " + spec );
    }
}
