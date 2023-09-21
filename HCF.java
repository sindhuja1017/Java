package com.codinghub;

public class HCF {

	public static void main(String[] args) {
		int a=150,b=50;
		int c=0;
		if(a>b)
		{
			for(int i=2; i<=b ; i++)
			{
				if((b%i==0) && (a%i==0))
				{
					if(i>c)
						c=i;
				}
			}
		}
		System.out.println(c);
	}

}
