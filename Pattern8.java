package com.codinghub;

public class Pattern8 {
/*  * * * * * * * * * 
	* *           * * 
	*   *       *   * 
	*     *   *     * 
	*       *       * 
	*     *   *     * 
	*   *       *   * 
	* *           * * 
	* * * * * * * * * */

	public static void main(String[] args) {
		int col=9,start=1;
		for(int i=start;i<=col;i++)
		{
			for(int j=start;j<=col;j++)
			{
				if(i==start||j==start||i==col||j==col||i==j)
				{
					System.out.print("* ");

				}
				//one method for both diagonals : ((i==start+1)&&(j==col-1))||((j==start+1)&&(i==row-1))
				else if(i+j==col+1)
				{
					System.out.print("* ");
				}//this else if can also be written as (if(i+j==end+1))
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
