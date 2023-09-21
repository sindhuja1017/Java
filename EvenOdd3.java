package com.codinghub;

public class EvenOdd3 {

	public static void main(String[] args) {
		int num=7862,rem,temp=num,new1=0;//8751
		for( ; num>0 ; num/=10)
		{
			rem=num%10;
			if(rem%2==0)
			{
				new1=new1*10+rem-1;
			}
			else
			{
				new1=new1*10+rem+1;
			}
		}
		System.out.println("new1 : "+new1);
		num=temp;
		int new3=0;
		for(; new1>0 ; new1/=10)
		{
			rem=new1%10;
			new3=new3*10+rem;
		}
		System.out.println("new3 : "+new3);
	}

}
