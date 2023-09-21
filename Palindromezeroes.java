package com.codinghub;

public class Palindromezeroes {

	public static void main(String[] args) {
		int num=105000,temp=num,rem,count=0,rev=0,num2=0;
		for(; num>0; num/=10)
		{	
			rem=num%10;
			rev=rev*10+rem;
		}
		num=temp;
		while(num%10==0)
		{
			rem=num%10;
			if(rem==0)
				count++;
			num=num/=10;
		}
		rev=rev*(int)Math.pow(10,count);
		System.out.println(rev);
	}

}
