class Vehicle 
{
	int speed=170;
}
class Car extends Vehicle
{
	int speed=130;
	void display()
	{
		System.out.println("Max speed: "+super.speed);
	}
}
class Super
{
	public static void main(String []args)
	{
		Car c=new Car();
		c.display();
	}
}
