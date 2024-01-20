import java.util.Scanner;
class OperationsCompare2
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String s=sc.next();
		String s2=sc.next();
		int ct=0;
		int diff=0;
		int max=Math.max(s.length(),s2.length());
		if(s.length()>s2.length())
		{
			diff=s.length()-s2.length();
		}
		else if(s.length()<s2.length())
		{
			diff=s2.length()-s.length();
		}
		for(int i=0; i<max-1; i++)
		{
			if(s.charAt(i)!=s2.charAt(i))
			{ 
				s=s.substring(0,i);
				s=s+s2.substring(i);
				ct++;
				i++;
			}
		}
		System.out.println(ct+" "+s+" "+s2);
	}
}
