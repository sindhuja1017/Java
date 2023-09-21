package com.codinghub;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 23;
		System.out.println("Guess the number : ");
		int x = s.nextInt();
		
		if(x==a)
		{
			System.out.println("Correct number");
		}
		else if(x>a)
		{
			System.out.println("Guessed number is high..");
		}
		else if(x<a)
		{
			System.out.println("Guessed number is low");
		}
		
	}

}
