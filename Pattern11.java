package com.codinghub;

public class Pattern11 {
 /* * * * 
	* * 
	*
 */

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)//i=1j=3print//i=1j=2print//i=1j=1print
			{//i=2j=3print//i=2j=2print//i=3j=3print
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
