package com.codinghub;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();
		int temp=num;
		int rem,count=0;
		double sum=0;
		for(; num>0 ; num/=10)
		{
			count++;
		}
		System.out.println("No of digits : " + count);
		num=temp;
		for(; num>0; num/=10)
		{
			rem=num%10;
			sum=sum+Math.pow(rem,count);
			System.out.println(sum);
			
		}
		System.out.println((temp==sum)?"Armstrong" : "Not armstrong");
		
	}

}
