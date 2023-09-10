package com.codinghub;

public class Primerange {

	public static void main(String[] args) {
		int notprime=0,i,j;
		for(i=2;i<=300;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					notprime=i;
				}
			}
			System.out.println(notprime+ "  ");
		}
	}

}
