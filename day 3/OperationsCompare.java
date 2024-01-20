import java.util.Scanner;
class OperationsCompare
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String s=sc.next();
		String s2=sc.next();
		int diff=0;
		if(s.length()>s2.length())
		{
			diff=s.length()-s2.length();
		}
		else if(s.length()<s2.length())
		{
			diff=s2.length()-s.length();
		}
		else
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i)!=s2.charAt(i))
				{
					diff++;
				}
			}
		}

		System.out.println(diff);
	}
}
