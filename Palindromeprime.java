package com.codinghub;

import java.util.Scanner;

public class Palindromeprime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		int temp=num,i,count=0,rem,new1=0;
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		for(; num>0 ; num/=10)
		{
			rem=num%10;
			new1=new1*10+rem;
		}
		if((new1==temp) && (count==0))
		{
			System.out.println("Palindrome prime");
		}
		else
			System.out.println("Not palindrome prime");
	}

}
