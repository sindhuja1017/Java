package com.codinghub;

public class Lastdigitprime {

	public static void main(String[] args) 
	{
		int num=129,last,count=0;
		last=num%10;
		for(int i=2;i<=last/2;i++)
		{
			if(last%i==0)
				count++;
		}
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}

}
