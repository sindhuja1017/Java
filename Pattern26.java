package com.codinghub;

public class Pattern26 {

	public static void main(String[] args) {
/*		1 2 3 4 3 2 1 
		1 2 3 4 3 2 1 
		1 2 3 4 3 2 1 
		1 2 3 4 3 2 1 
*/
		int y;
		for(int x=1;x<=4;x++)
		{
			for(y=1;y<=4;y++)
			{
				System.out.print(y+" ");
			}
			for(int z=y-2;z>=1;z--)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
	}

}
