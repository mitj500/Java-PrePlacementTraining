import java.util.Scanner;
class Anagram
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String a=sc.next();
		String b=sc.next();
		a=a.toLowerCase();
		b=b.toLowerCase();
		int flag=0;
		char arr1[]=a.toCharArray();
		char arr2[]=b.toCharArray();
		char temp='a';
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				if(arr1[i]<arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
				if(arr2[i]<arr2[j])
				{
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]==arr2[i])
				flag=1;
			else
			{
				flag=0;
				break;
			}	
		}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
