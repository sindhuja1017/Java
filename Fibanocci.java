package com.codinghub;

public class Fibanocci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		int n=1;
		while(n<=15)
		{
			System.out.println(a);//0//1//1//2//3//5//8//13
			c=a+b;//c=1//c=2//c=3//c=5//c=8//c=13//21//34
			a=b;//a=1//a=1//a=2//a=3//a=5//a=8//a=13//21
			b=c;//b=1//b=2//b=3//b=5//b=8//b=13//b=21//34
			n++;
		}
	
	}

}
