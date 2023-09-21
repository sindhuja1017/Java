package com.codinghub;

public class Switch {

	public static void main(String[] args) 
	{
		char x='+';
		int a=8,b=4;
		switch(x)
		{
		case '+' : System.out.println(a+b);
			break;
		case '-' : System.out.println(a-b);
			break;
		case '*' : System.out.println(a*b);
			break;
		case '%' : System.out.println(a%b);
			break;
		case '/' : System.out.println(a/b);
			break;
		default : System.out.println("Wrong input");
		}

	}

}
