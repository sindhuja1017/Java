package com.codinghub;

public class Palindrome {

	public static void main(String[] args) {
		int n=1234321,temp=n,rem,newnum=0;
		for( ;n>0;n=n/10)
		{
			rem=n%10;
			newnum=newnum*10+rem;			
		}
		System.out.println((temp==newnum)?"Palindrome":"Not palindrome");
		System.out.println("New number is  "+newnum);

	}

}
