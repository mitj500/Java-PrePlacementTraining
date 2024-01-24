import java.util.Scanner;
class Employee
{
	int eno;
	String ename, city;
	double esal;
	public Employee(double esal)
	{
		this.esal=esal;
	}
	public void work()
	{
		System.out.println("Employee is working on a chatbot");
	}
	public void getSalary()
	{
		System.out.println("Salary: "+esal);
	}
	public void addEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter city: ");
		String city1=sc.next();			
		eno=num;
		ename=name;
		city=city1;
	}	
}
class HRManager extends Employee
{
	HRManager()
	{
		super(50000.0);
	}
	public void work()
	{
		System.out.println("Employee is working");
	}
	public void showEmployee()
	{
		System.out.println("Name: "+ename);
		System.out.println("Employee number: "+eno);
		System.out.println("Salary: "+esal);
		System.out.println("City: "+city);
	}
	public static void main(String []args)
	{
		Employee e=new Employee(0);
		e.work();
		HRManager ob=new HRManager();
		ob.work();
		ob.getSalary();
		ob.addEmployee();
		ob.showEmployee();
	}
}
	
		
