class Age
{
	public static void main(String[] args)
	{
		int age=54;
		if(age<18)
		{
			System.out.println("Minor ");
		}
		else
		{
			if(age>50)
			{
				System.out.println("Senior citizen");
			}
			else
			{
				System.out.println("Major");
			}
		}
	}
}