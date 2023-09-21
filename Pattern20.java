package com.codinghub;

public class Pattern20 {

	public static void main(String[] args) {
		int k=1,count=0;
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						
						while(k<30)
						{
							
							count=0;
							for(int x=2;x<k;x++)
								{
									if(k%x==0)
										count++;
								}
						if(count==0)
							System.out.print(k+ " ");
						
						k++;
						}
					}
					System.out.println();
				}	
	}

}
