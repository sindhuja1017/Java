package com.codinghub;

public class AutomaticRange {

	public static void main(String[] args) {
		int i, j ,count,temp,auto,k;
		for(i=5;i<=10000;i++)
		{
			count=0;
			j=i;
			temp=j;
			for(; j>0;j/=10)
			{
				count++;
			}
			k=i*i;//5776
			auto=k%(int)(Math.pow(10, count));
			if(auto == i)
				System.out.println("Automatic : " + i);
				
		}

	}

}
