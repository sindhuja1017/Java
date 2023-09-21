package com.codinghub;

public class Pattern25 {
/*   1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
1 2 3 4 5 6 
 1 2 3 4 5 
  1 2 3 4 
   1 2 3 
    1 2 
     1
*/
	public static void main(String[] args) {
		int x,y,z;
		for(x=1;x<=6;x++)
		{
			for(z=6;z>x;z--)
			{
				System.out.print(" ");
			}
			for(y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		for(x=1;x<=6;x++)
		{
			for(z=1;z<=x;z++)
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
