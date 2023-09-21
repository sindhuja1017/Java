class DISCOUNT
{
	public static void main(String[] args)
	{
		double total=2500;
		double discount;
		if (total>2000)
		{
			discount=10.0/100*total;
		}
		else
		{
			discount=5.0/100*total;
		}
		System.out.println("Discount :  " + discount);
		System.out.println("After discount :  " + (total-discount));
	}
}