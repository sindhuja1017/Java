package com.codinghub;

public class Rangeofreverse {

	public static void main(String[] args) {
		 int i,j,k,rem,count=0,rev=0;
		 for(i=1;i<=20;i++)//1
		 {
			 count=0;
			 rev=0;
			 for(j=i;j>=0;j/=10)//j=1
			 {
				 rem=j%10;//1
				 rev=rev*10+rem;//1
			 }
			 System.out.println(rev);
			 if(rev==i)//1==1
			 {
				 count=0;
				 for(k=1;k<=i;k++)
				 {
					 if(i%k==0)
					 {
						 count++;
						 
					 }
					 
				 }
				 if(count==2)
					 System.out.println(i);
			 }
			 else
				 System.out.println(i);
		 }
		 
		
	}

}
