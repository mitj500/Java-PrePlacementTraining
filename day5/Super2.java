class Person
{
	void message()
	{
		System.out.println("Person Class");
	}
}
class Student extends Person
{
	void message()
	{
		System.out.println("Student Class");
	}
	void display()
	{
		message();
		super.message();
	}
}
class Super2
{
	public static void main(String []args)
	{
		Student s=new Student();
		s.display();
	}
}
