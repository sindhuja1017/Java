class Profit
{
	public static void main(String[] args)
	{
		int cp=5600;
		int sp=5200;
		if ( sp >  cp )
		{
			System.out.println("Profit is  :  " + (sp-cp));
		}
		else
		{
			System.out.println("Loss is  :  " + (cp-sp));
		}
	}
}