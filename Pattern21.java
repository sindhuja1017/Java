package com.codinghub;

public class Pattern21 {

	public static void main(String[] args) {
		int k,new1=0,rem=0,temp=1,n;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				n=temp;
				{
					for(;temp>0;temp/=10)
					{
						rem=temp%10;
						new1=new1*10+rem;
					}
					if(new1==temp) 
					{
					System.out.print(temp+ " ");
					break;
					}
				}
				System.out.println();
			}
		}
	}

}
