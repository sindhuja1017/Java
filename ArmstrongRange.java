package com.codinghub;

public class ArmstrongRange {

	public static void main(String[] args) {
		int i , temp,j,sum,count,rem;
		for(i=1;i<=10000;i++)
		{
			j=i;
			count=0;
			sum=0;
			for(;j>0;j/=10)
			{
				count++;
			}
			
			for(j=i; j>0;j/=10)
			{
				rem=j%10;
				sum=sum+(int)(Math.pow(rem, count));
			}
			if(sum == i)
				System.out.println("Armstrong : " + i);
			
		}
	}

}
