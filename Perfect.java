class Perfect
{
	public static void main(String[] args)
	{
		int x=492;
		double y=Math.sqrt(x);
		if((y)==(int)(y))
		{
			System.out.println(x + " is a perfect square ");
		}
		else
		{
			System.out.println(x + "  is not a perfect square ");
		}
	}
}