package com.codinghub;

public class PalindromeRange {

	public static void main(String[] args) {
		int i,j,rev,rem;
		for(i=1;i<=1000;i++)
		{
			rev=0;
			for(j=i;j>0;j/=10) 
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev == i)
				System.out.println("Palindrome : " + i);
		}
	}

}
