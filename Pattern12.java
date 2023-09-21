package com.codinghub;

public class Pattern12 {
	/*
	A
	BB
	CCC
	DDDD
	 */

	public static void main(String[] args) {
		int start=65;
		for(int i=start;i<=68;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
	}

}
