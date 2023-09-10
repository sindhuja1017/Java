package com.codinghub;

public class Currency {

	public static void main(String[] args) {
		int amount=590,hun,fifty,ten;
		hun=amount/100;
		System.out.println("hun :  "+hun);
		amount=amount-hun*100;
		System.out.println("amount : " +amount);
		fifty=amount/50;
		amount=amount-fifty*50;
		System.out.println("fifty : " + fifty +"	amount : "+amount);
		ten=amount/10;
		System.out.println("TEN : "+ten + "	amount : "+amount);
	}

}
