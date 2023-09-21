package com.codinghub;

public class EvilRange {

	public static void main(String[] args) {
		int i,j,sum1=0,rem=0,temp;
		for(i=1;i<=10000;i++)
		{
			sum1=0;
			j=i*i;
			temp=j;
			for(;j>0;j/=10)
			{
				rem=j%10;
				sum1=sum1+rem;
			}
			if(sum1*sum1 == temp)
			{
				System.out.println("Evil : " + i);
			}
		}
	}

}
