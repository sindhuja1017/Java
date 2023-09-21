package com.codinghub;

public class Reversingnumbers {

	public static void main(String[] args) {
		int num=654321,rem,rev=0,sumodd=0,temp=num;
		for( ; num>0 ; num/=10)
		{
			rem=num%10;
			if(rem%2!=0)
			{
				sumodd=sumodd+rem;
				rev=rev*10+sumodd;
			}
			else
			{
				
			}
		}
	}

}
