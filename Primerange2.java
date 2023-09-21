package com.codinghub;

public class Primerange2 {

	public static void main(String[] args) {
		int i,j,count=0;
		boolean flag=true;
		for(i=2;i<=10;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println(i + "  ");
		}
	}

}
/*for (j = 2; j <= i / 2; ++j) 
{
    if (i % j == 0) 
    {
        flag = 0;
        break;
    }
}*/
