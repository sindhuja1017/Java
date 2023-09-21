package com.codinghub;

public class Pattern9 {

	public static void main(String[] args) {
		/*a b c 
		  a b c 
		  a b c*/ 
		int row=3;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(j==1)
					System.out.print("a ");
				else if(j==2)
					System.out.print("b ");
				else if(j==3)
					System.out.print("c ");
			}
			System.out.println();
		}
		
	}

}