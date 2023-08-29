class While6
{
	public static void main(String[] args)
	{
		int x=1,sum=0,multiple=1;
		while(x<=10)
		{
			if(x%2==0)
				sum=sum+x;
			else
				multiple=multiple*x;
			x++;
		}
		System.out.println("Sum of even numbers :  " +sum);
		System.out.println("Multiplying all odd numbers :  " +multiple);
	}
}