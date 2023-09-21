package com.codinghub;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		/*
		 *  *  *  *  *  *  
		 *              *  
		 *              *  
		 *  *  *  *  *  *  

		 */
		Scanner s= new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row=s.nextInt();
		System.out.println("Enter columns: ");
		int col=s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if((i==1 || i==row) || (j==1 || j==col))
					System.out.print("*  ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}

}
