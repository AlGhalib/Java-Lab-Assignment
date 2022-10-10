import java.util.Scanner;


class CountCharFrequency
{
    public void countDisplayCharFrequency(String s)
    {
        // int freq[] = new int[256];
        // for(int i = 0; i < 256; i++) freq[i] = 0;

        // for(int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        int check[] = new int[256];

        for(int i = 0; i < 256; i++) check[i] = 0;

        for(int i = 0; i < s.length(); i++)
        {
			int f = 0;
			char c = s.charAt(i);
			if(check[c] == 0)
			{
				for(int j = 0; j < s.length(); j++)
				{
					char a = s.charAt(j);
					if(c == a) f++;
					check[c] = 1;
				}
				System.out.println("Number of Occurance of " + c + " is = " + f);
			}

		}

      //  for(int i = 0; i < 256; i++)
      //  {
      //      if(freq[i] != 0)
      //      {
      //          System.out.println("Number of Occurance of " + (char)i + " is = " + freq[i]);
      //      }
      //  }
    }
}
public class Problem_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        CountCharFrequency myObj = new CountCharFrequency();
        myObj.countDisplayCharFrequency(s);
    }
}