package com.codinghub;

public class Perfectnumber {

	public static void main(String[] args) 
	{
		int x,sum=0,num=28;
		for(x=1;x<=num;x++)
		{
			if(num%x==0)
				sum=sum+x;
		}
		if(sum/2==num)
			System.out.println("Perfect number");
		else
			System.out.println("Not perfect number");
	}

}
