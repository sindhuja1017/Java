package com.codinghub;

public class Perfectsquare {

	public static void main(String[] args) 
	{
		int num=11;
		double squ =Math.sqrt(num);
		if(squ == (int)squ)
			System.out.println("Perfect square");
		else
			System.out.println("Not a perfect square");
	}

}
