package com.codinghub;

public class Reversingdigits {

	public static void main(String[] args) {
		//program to interchange the digits
		//desired output :2734
		int num=4372,rem1=0,new1=0,rem2=0;
			rem1 = num % 10;//2
			new1=new1*10+ rem1;//2
			num=num/10;//437
			rem1=num%10;//7
			num=num/10;//43
			rem2=num%10;//3
			new1=new1*10+rem1;//20+3=23
			new1=new1*10+rem2;//23*10+7=237
			num=num/10;//4
			new1=new1*10+num;//2370 + 4 =2374
			System.out.println(new1);
		
		}
		
	}
