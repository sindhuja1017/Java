package com.codinghub;

public class TechnologyRange {

	public static void main(String[] args) {
		int x,y,rem1=0,number=0,count=0,rem2=0,sum1=0,squ=1;
		for(x=1;x<=10000;x++)
		{	count=0;
			for(y=x;y>0;y/=10)
			{
				count++;
			}
			y=x;
			number=count/2;
			
			rem1=y/(int)(Math.pow(10, number));
			
			rem2=y%(int)(Math.pow(10, number));
			
			sum1=rem1+rem2;
			
			
			if(sum1*sum1==x)
			{
					System.out.println("Techno : " + x);
			}
		}
	}

}
