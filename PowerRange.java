package com.codinghub;

public class PowerRange {

	public static void main(String[] args) {
		int i,j,sum,pro,rem;
		for(i=1;i<=10000;i++)
		{
			sum=0;
			pro=1;
			for(j=i;j>0;j/=10)
			{
				rem=j%10;
				sum=sum+rem;
				pro=pro*rem;
			}
			if(sum == pro)
			{
				System.out.println("Power no. : " + i);
			}
		}
	}

}
