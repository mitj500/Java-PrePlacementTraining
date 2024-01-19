import java.util.Arrays;
class Array4
{
	public static void main(String []args)
	{
		String[] arr1={"abc","def","abc","def","ghi"};
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=1; j<arr1.length; j++)
			{
				if(arr1[i].equals(arr1[j]) && (i!=j))
					System.out.println("Duplicate: "+arr1[i]);
			}
		}
	}
}
