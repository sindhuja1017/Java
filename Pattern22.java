package com.codinghub;

public class Pattern22 {
/*  1 
	2 3 
	3 4 5 
	4 5 6 7 
	5 6 7 8 9 	
*/
	public static void main(String[] args) {
		int k;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(k=i;k<=i+i-1;)
				{
					System.out.print(k+" ");
					k++;
				}
				break;
			}
			System.out.println();
		}
	}

}
