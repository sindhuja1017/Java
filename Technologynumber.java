package com.codinghub;

public class Technologynumber {

	public static void main(String[] args) {
		int x=2025,y=x,rem1=0,count=0,rem2=0,sum1=0;
		for(;x>0;x/=10)
		{
			count++;
		}
		x=y;
		System.out.println(count);
		int number=count/2;
		
		rem1=x/(int)(Math.pow(10,number));
		rem2=x%(int)(Math.pow(10,number));
		System.out.println(rem1 +"  "+rem2);
		sum1=rem1+rem2;
		if(sum1*sum1==y)
			System.out.println("Technology number");

	}

}
