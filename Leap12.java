package com.codinghub;

public class Leap12 
{

	public static void main(String[] args) 
	{
		int year=2023,last2=0,first2=0;
		if(year%4==0 && ((year%100!=0) || (year%400==0)))
		{
			last2=year%100;
			if(last2 % 2==0)
			
				System.out.println("Even number");
			else
				System.out.println("Odd number");
			
		}
		else
		{
			last2=year%100;
			first2=year/100;
			System.out.println("Sum of first2 digits and last2 digits is  " +(last2+first2));
			int sum=first2+last2;
			int n=sum%10+sum/10;
			System.out.println("Sum of sum digits : " +n);
		}
		
	}

}

