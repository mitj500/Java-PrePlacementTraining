class StringImmu
{
	public static void main(String []args)
	{
		String str="Hello";
		System.out.println(str);
		
		String str1=new String("Hello");
		System.out.println(str1);
		
		char ch[]={'h','e','l','l','o'};
		String str3=new String(ch);
		System.out.println(str3);
		
		char ch1[]={'h','e','l','l','o','h','i'};
		String str4=new String(ch1,2,4);
		System.out.println(str4);
		
		byte b[]={65,66,67,68};
		String str5=new String(b);
		System.out.println(str5);
		
		byte b1[]={65,66,67,68};
		String str6=new String(b,0,2);
		System.out.println(str6);
	}
}
