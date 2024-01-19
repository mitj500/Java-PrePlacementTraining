import java.util.Arrays;
class Array5
{
	public static void main(String []args)
	{
		int num1[]={1,2,3,4,5,6};
		int num2[]=Arrays.copyOf(num1,6);
		System.out.println(Arrays.toString(num2));
		int num3[]=new int[10];
		System.arraycopy(num2,0,num3,0,6);
		System.out.println(Arrays.toString(num3));
	}
}
