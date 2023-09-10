package com.codinghub;

public class Fourdigit 
{

	public static void main(String[] args) 
	{
		int num,fact=1,sum=0,count=0;
		for(num=111212;num>0;num=num/10)
		{//1212==>1212%10
			int rem=num%10;
			sum=sum+rem;
		}
		System.out.println("sum:  "  + sum);
		for(int x=2;x<=sum/2;x++)
		{
			if(sum%x==0)
				count++;
		}
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("not prime");
		for(int i=1;i<=sum;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : " + fact);

	}

}
