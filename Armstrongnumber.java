package com.codinghub;

public class Armstrongnumber {

	public static void main(String[] args) {
		int num=1634,rem,temp = num;
		double num2=0;
		for( ; num > 0 ; num/=10)
		{
			rem=num%10;
			num2=num2+Math.pow(rem, 4);
			
		}
		System.out.println(num2);
		if(temp==num2)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
		
	}

}
