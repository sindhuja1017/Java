package com.codinghub;

public class Pattern24 {

	public static void main(String[] args) {
		int x,y,z;
		for(x=1;x<=7;x++)//x=1//x=2
		{
			for(y=6;y>=x;y--)//y=6//y=6
				//      1  6spaces
				//     1 2
				//    1 2 3
				//   1 2 3 4
				//  1 2 3 4 5
				// 1 2 3 4 5 6
				//1 2 3 4 5 6 7
			{
				System.out.print(" ");
			}
			for(z=1;z<=x;z++)
			{
				System.out.print(z+" ");//1
				//1 2 
			}
			System.out.println();
		}
	}

}
