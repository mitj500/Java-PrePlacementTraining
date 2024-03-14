import java.util.Scanner;
class UsernamePassword
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=10;
		
		String user[]={"abc","def","ghi","jkl","mno","pqr","stu","vwx","abc","def"};
		String pass[]={"123","456","789","123","456","789","234","222","43","56"};
		
		System.out.println("Enter Username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter password: ");
		String password=sc.nextLine();
		
		int loc=0;
		boolean flag=false;
		for(int i=0; i<10; i++)
		{
			if(username.equals(user[i]) && password.equals(pass[i]))
			{
				flag=true;
				loc=i;
			}
		}
		if(flag)
			System.out.println("Match found at index "+loc);
		else
			System.out.println("Match not found");
		
	}
}
