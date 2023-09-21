package com.codinghub;

public class Pattern28 {
/*	1 2 3 4 5 
	 1 2 3 4 
	  1 2 3 
	   1 2 
	    1 
*/
	public static void main(String[] args) {
		int x,y,z;
		for(x=1;x<=5;x++)
		{
			for( z=1;z<x;z++)
			{
				System.out.print(" ");
			}
			for(y=1;y<=6-x;y++)
			{
				System.out.print(y+" ");
			}
			
			System.out.println();
		}
	}

}
