package com.codinghub;

public class Addingdigits {

	public static void main(String[] args) {
		int num=12391,rem,num2=0,num3=0;
		int temp=num;
		//first reversing the number
		for(; temp>0;temp/=10)
		{
			rem=temp%10;
			num3=num3*10+rem;
		}
		//next adding 1 to each digit except 9
		for( ; num3>0 ; num3/=10)
		{
			rem=num3%10;
			if(rem!=9)
			{
				num2=num2*10+rem+1;
			}
			else
				num2=num2*10+0;
		}
		System.out.println(num2);
	}

}
