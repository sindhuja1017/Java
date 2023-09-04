class Factors
{
	public static void main(String[] args)
	{
		int a=5,b=15;
		int c=1;
		while(c<=a)	
		{
		if(a%c == 0 )
		{
			if(b%c==0)
			System.out.println("Common factor :   " + c);
		}
		c++;
		}
	}
}