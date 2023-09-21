package com.codinghub;

public class Ascending 
{
	
	public static void main(String[] args) 
	{
		int n=10;
		
		for(int x=1;x<=10;x++)
		{
			if(n%2==0)
			{
				System.out.println(n + "*" +x+ "=" +(n*x));
			}
			else
			{
				if(x%2==0)
				{
					System.out.println(n + "*" +x+ "=" + (n*x));
				}
			}
		}
		/*for(int i=1;i<=10;i++)
		{
			if((n*i)%2==0)
				System.out.println(n+ "*" +i+ "=" + (n*i) );
		}
		for(int j=1;j<=10;j++)
		{
			if(j%2==0)
			{
				System.out.println(n + "*" +j+ "=" + (n*j));
			}
		}
		for(int k=1;k<=10;k++)
		{
			if(n%2==0)
			{
				System.out.println(n + "*" +k+ "=" + (n*k));
				
			}
		}*/
	}

}
