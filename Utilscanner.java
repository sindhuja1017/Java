package com.codinghub;
import java.util.Scanner;

public class Utilscanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a=s.nextInt();
		System.out.println("Enter b : ");
		int b=s.nextInt();
		System.out.println("Enter c : ");
		int c= s.nextInt();
		System.out.println("sum of a,b,c : " +(a+b+c));
		System.out.println("Enter a fractional d value: ");
		double d = s.nextDouble();
		System.out.println(d);
		String s1=s.next();
		s.nextLine();
		String s2=s.nextLine();
		System.out.println("s1 : " + s1 + " s2 : "+s2);
		System.out.println("Enter a character : ");
		char s3 = s.next().charAt(0);
		System.out.println("...."+s3+"....");
	}

}
