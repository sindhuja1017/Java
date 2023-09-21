class Divisible
{
	public static void main(String[] args)
	{
		int x=456;
		int y=4;
		System.out.println("Initialized variables  :   x =  " +x+  "   y =  "  +y);
		
		if(x%y==0)
		{
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("AFTER SWAPPING  ");
			System.out.println(x + "          "  +y);
		}
		
	}
}