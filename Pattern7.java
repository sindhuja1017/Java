package com.codinghub;

public class Pattern7 {

	public static void main(String[] args) {
		int row=5,col=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1)
				{
					System.out.print(j+" ");
				}
				else if(j==1)
				{
					System.out.println();
					System.out.print(i);
					
				}
			}
		}
		
	}

}
