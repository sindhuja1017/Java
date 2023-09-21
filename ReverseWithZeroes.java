package com.codinghub;

import java.util.Scanner;

public class ReverseWithZeroes {

	public static void main(String[] args) {
		int rem,count=0,rev=0;
		int count1=0,count2=0,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Number : " + num);
		int temp1=num;
		for( ; num >0 ; num/=10)
		{
			count1++;//count==7
			rem=num%10;
			rev=rev*10+rem;
		}
		temp=rev;
		
		for( ; rev >0;rev/=10)
		{
			count2++;
		}
		count=count1-count2;
		
	
		for( ; temp>0;temp/=10)
		{
			rem=temp%10;
				switch(rem)
				{
				case 0:System.out.println(" Zero ");
				break;
				case 1:System.out.print(" One ");
				break;
				case 2 : System.out.print(" Two ");
				break;
				case 3 : System.out.print(" Three ");
				break;
				case 4 : System.out.print(" Four ");
				break;
				case 5:System.out.print(" Five ");
				break;
				case 6:System.out.print(" Six ");
				break;
				case 7 : System.out.print(" Seven ");
				break;
				case 8 : System.out.print(" Eight ");
				break;
				case 9 : System.out.print(" Nine ");
				break;
				}
		}
		for( ; count>0 ; count--)
		{
			System.out.print(" Zero ");
		}
	}

}
