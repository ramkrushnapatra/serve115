package com.maren.demosec.controller;

public class utilClass {

	public static int getReverse(int x) {
		int rev=0;
		while(x!=0) {
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		return rev;
	}

}
