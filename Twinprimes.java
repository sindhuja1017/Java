package com.codinghub;

import java.util.Scanner;

public class Twinprimes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int count=0,count2=0;
		for(int i=2; i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			for(int j=a+2;j<b;j++)
			{
				if(b%j==0)
				{
					count2++;
				}
			}
			if(count2==0 && ((a-b==2) || (b-a==2)))
			{
				System.out.println("Twin primes");
			}
			else
				System.out.println("not twin primes");
		}
		else
			System.out.println("Not twin primes");
	}

}
