package com.codinghub;

public class Reversenumber {

	public static void main(String[] args) {
		int num,rem,rev=0,count=0,newnum=0;
		for(num = 15000 ; num>0;num/=10)
		{
			rem=num%10;
			System.out.println(rem);
			if(rem == 0)
				count++;
			else
				rev=rev*10+rem;
		}
		System.out.println(rev);
		newnum=rev*(int)Math.pow(10, count);
		System.out.println("rev : " + newnum);
	}

}
