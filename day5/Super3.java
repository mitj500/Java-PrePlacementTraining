class Person
{
	Person()
	{
		System.out.println("Person Class Constructor");
	}
}
class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Student Class Constructor");
	}
}
class Super3
{
	public static void main(String []args)
	{
		Student s=new Student();
	}
}
