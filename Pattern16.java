package com.codinghub;

public class Pattern16 {
/*
1
21
321
4321	
 */

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
