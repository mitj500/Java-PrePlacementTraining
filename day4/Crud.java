import java.util.Scanner;
class StudentCrud
{
	int rollno[]=new int[10];
	String name[]=new String[10];
	String city[]=new String[10];
	String mob[]=new String[10];
	int i=0;
	public void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno.: ");
		int rno=sc.nextInt();
		System.out.println("Enter name.: ");
		String name1=sc.next();
		System.out.println("Enter city: ");
		String city1=sc.next();
		System.out.println("Enter mobile: ");
		String mob1=sc.next();
		rollno[i]=rno;
		name[i]=name1;
		city[i]=city1;
		mob[i]=mob1;
		i++;
	}
	public void showInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Rollno\tName\tMobile\tCity\n----------------------------------------");
		for(int j=0; j<i; j++)
		{
				System.out.print(rollno[j]+"\t");
				System.out.print(name[j]+"\t");
				System.out.print(mob[j]+"\t");
				System.out.print(city[j]+"\n");
		}			
	}
	public void deleteData()
	{
		int loc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter rollno.: ");
		int rno=sc.nextInt();
		for(int j=0; j<i; j++)
		{
			if(rollno[j]==rno)
			{
				System.out.println("Rollno: "+rollno[j]);
				System.out.println("Name: "+name[j]);
				System.out.println("Mobile: "+mob[j]);
				System.out.println("City: "+city[j]);
				loc=j;
				for(int k=loc; k<i; k++)
				{
					rollno[k]=rollno[k+1];
					mob[k]=mob[k+1];
					city[k]=city[k+1];
					name[k]=name[k+1];
				}
				i--;
			}
		}
	}
	public void updateData()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter rollno.: ");
		int rno=sc.nextInt();
		for(int j=0; j<i; j++)
		{
			if(rollno[j]==rno)
			{
				System.out.println("Rollno: "+rollno[j]);
				System.out.println("1. Name: "+name[j]);
				System.out.println("2. Mobile: "+mob[j]);
				System.out.println("3. City: "+city[j]);
				System.out.println("4. Cancel");
				System.out.println("Enter your choice: ");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1: System.out.println("Enter new name: ");
							String name2=sc.next();
							name[j]=name2;
							break;
					case 2: System.out.println("Enter new mobile: ");
							String mob2=sc.next();
							mob[j]=mob2;
							break;
					case 3: System.out.println("Enter new city: ");
							String city2=sc.next();
							city[j]=city2;
							break;
					case 4: break;
				}
			}
		}	
		
	}
}

class Crud
{
	public static void main(String []args)
	{	
		StudentCrud ob=new StudentCrud();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("\n1. Input\n2. Show\n3. Delete\n4. Update\n5. Exit\nEnter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: ob.inputData();
						break;
				case 2: ob.showInfo();
						break;
				case 3: ob.deleteData();
						break;
				case 4: ob.updateData();
						break;
				case 5: System.exit(0);
				default: System.out.println("Invalid choice");
			}
		}
	}	
}
