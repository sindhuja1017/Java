class Prime2
{
public static void main(String[] args)
	{
		int n=66,i=1,count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		System.out.println(n+ "  is a prime number");
		else
		System.out.println(n+  "  is not a prime number");
	}
}