class Descending
{
	public static void main(String[] args)
	{
		int a=400,b=500,c=150;
		if(c>a)
		{
			c=c+a;
			a=c-a;
			c=c-a;
		}
		if(c>b)
		{
			c=c+b;
			b=c-b;
			c=c-b;
		}
		if(b>a)
		{
			b=b+a;
			a=b-a;
			b=b-a;
		}
		System.out.println("A value :  " + a);
		System.out.println("B value :  " + b);
		System.out.println("C value :  " + c);
	}
}
