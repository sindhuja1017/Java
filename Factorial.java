class Factorial
{
	public static void main(String[] args)
	{
		int fact=1,n=5,i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial :  " +fact);
	}
}