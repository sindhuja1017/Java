package com.codinghub;

public class AlienRange {

	public static void main(String[] args) {
		int i,j,rev,rem,squ1,temp,newsqu=0;
		for(i=1;i<=10000;i++)
		{
			rev=0;
			for(j=i;j>0;j/=10)//i=12//i=30
			{
				rem=j%10;
				rev=rev*10+rem;//rev=21//rev=3
			}
			squ1=i*i;//squ1=144//squ1=900
			newsqu=0;
			for(; squ1>0;squ1/=10)
			{
				rem=squ1%10;
				newsqu=newsqu*10+rem;
			}//newsqu=441//newsqu=009
			if(newsqu == rev*rev)//441==441//009==009
				System.out.println("Alien : " + i);//12
		}
	}

}
