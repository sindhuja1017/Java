package com.codinghub;

public class Pattern23 {
/*	_ _ _ _ _ 1 
	_ _ _ _ 1 2 
	_ _ _ 1 2 3 
	_ _ 1 2 3 4 
	_ 1 2 3 4 5 
	1 2 3 4 5 6 
	_ 1 2 3 4 5 
	_ _ 1 2 3 4 
	_ _ _ 1 2 3 
	_ _ _ _ 1 2 
	_ _ _ _ _ 1 
	_ _ _ _ _ _ 
*/
	public static void main(String[] args) {
		int x,y,z;
		for(x=1;x<=6;x++)
		{
			for(y=6;y>x;y--)
			{
				System.out.print("_ ");
			}
			for(z=1;z<=x;z++)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		for(x=1;x<=6;x++)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print("_ ");
			}
			for(y=1;y<=6-x;y++)
			{
				System.out.print(y+ " ");
			}
			System.out.println();
		}
	}

}
