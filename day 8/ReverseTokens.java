import java.util.Scanner;
import java.util.StringTokenizer;
class ReverseTokens
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		String rev="";
		
		String res="", p="";
		int last=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ' || i==str.length()-1){
				p=str.substring(last, i+1);
				last=i;
				res=p+" "+res;
			}
			
		}
		
		// 2nd Approach
		System.out.println(res);
		
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			rev=st.nextToken()+" "+rev;
		}
		System.out.println(rev);
	}
}
