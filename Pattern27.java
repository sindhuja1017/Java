package com.codinghub;

public class Pattern27 {

	public static void main(String[] args) {
/*	        1 
	      1 2 1 
	    1 2 3 2 1 
	  1 2 3 4 3 2 1
	    1 2 3 2 1
	      1 2 1
	        1
*/ 
		int x,y,z,k;
		for(x=1;x<=4;x++)
		{
			for(k=1;k<=4-x;k++)
			{
				System.out.print("  ");
			}
			
			for(y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			
			for(z=x-1;z>=1;z--)
			{
				System.out.print(z+ " ");
			}
			System.out.println();
		}
		for(x=1;x<=4;x++)
		{
			for(k=1;k<=x;k++)
			{
				System.out.print("  ");
			}
			for(y=1;y<=4-x;y++)
			{
				System.out.print(y+" ");
			}
			for(z=3-x;z>=1;z--)
			{
				System.out.print(z+ " ");
			}
			System.out.println();
		}
		
	}

}
