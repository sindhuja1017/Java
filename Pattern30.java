package com.codinghub;

public class Pattern30 {
/*		  1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1 
    1 2 3 4 3 2 1 
      1 2 3 2 1 
        1 2 1 
          1 	               
*/
	public static void main(String[] args) {
		int x,y,z,k;
		for(x=1;x<=5;x++)
		{
			for(k=5;k>=x;k--)
			{
				System.out.print("  ");
			}
			for(y=1;y<=x;y++)
			{
				System.out.print(y+ " ");
			}
			for(z=x-1;z>=1;z--)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		for(x=1;x<=5;x++)
		{
			for(k=1;k<=x+1;k++)
			{
				System.out.print("  ");
			}
			for(y=1;y<=5-x;y++)
			{
				System.out.print(y+" ");
			}
			for(z=4-x;z>=1;z--)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		

	}

}
