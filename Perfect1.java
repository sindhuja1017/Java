class Perfect1
{
	public static void main(String[] args)
	{
		int n,sum=0,i;
		for(n=1;n<=100;n++)
		{
			for(i=1;i<n;i++)
			{
				if(n%i==0)
					{sum=sum+i;}
			}
		
		if(sum==n)
			System.out.println(n);
		}
	}
}