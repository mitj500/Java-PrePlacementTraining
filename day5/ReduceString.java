import java.util.Scanner;
class ReduceString
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String s=sc.next();
		s=s+" ";
		String s2="";
		int ct=1;
		for(int i=1; i<s.length(); i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				ct++;
			}
			else
			{
				if(ct==1)
					s2=s2+s.charAt(i-1)+"";
				else
					s2=s2+s.charAt(i-1)+""+ct;
				ct=1;
			}
		}
		System.out.println(s2);
	}
}
			
