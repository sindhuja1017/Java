package com.codinghub;

import java.util.Scanner;

public class Noofprimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int rem,count=0;
		for(; num>0 ; num/=10)
		{
			count=0;
			rem=num%10;
			for(int i = 2 ; i<rem;i++)
			{
				if(rem%i==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
				System.out.println(rem);
		}
	}

}
