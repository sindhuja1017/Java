package com.codinghub;

import java.util.Scanner;

public class Newww {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,sum=0;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter a value : ");
			a=s.nextInt();
			sum=sum+a;
		}
		double average= sum/10.0;
		System.out.println(average);
		
	}

}
