class Prime3
{
	public static void main(String[] args)
	{
		int n=17,a=56,count=0;
		while(a>=1)
		{
			if(n%a==0)
			{
				count++;
			}
		a--;
		}
		if(count==2)
		System.out.println("Prime number");
		else
		System.out.println("Not prime number");
	}
}