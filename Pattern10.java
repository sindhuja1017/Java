package com.codinghub;

public class Pattern10 {
	/*
	 * 
	 */

	public static void main(String[] args) {
		int col=4;
		for(int i=1;i<=col;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if((i+j>col)) 
				{
					System.out.print("* ");
					
					
				}
				else
				{
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
	}

}
