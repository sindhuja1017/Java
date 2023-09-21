package com.codinghub;

public class Pattern17 {
/*
54321
4321
321
21
1
 */

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//i=1//i=2//i=3
		{
			for(int j=6-i;j>=1;j--)//j=5//j=4//j=3
			{
				System.out.print(j);//5 4 3 2 1//4 3 2//3
			}
			System.out.println();
		}
		
	}

}
