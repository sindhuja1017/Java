package com.codinghub;

public class Pattern19 {
/*	2 
	4 6 
	8 10 12 
	14 16 18 20 */

	public static void main(String[] args) {
		int k=2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k+=2;
			}
			System.out.println();
		}
	}

}
