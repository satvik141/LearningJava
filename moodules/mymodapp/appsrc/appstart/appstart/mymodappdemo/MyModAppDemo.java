package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo{
	public static void main(String args[]){
		if (SimpleMathFuncs.isFactor(2,10)) System.out.println("2 is a factor of 10");
		
		System.out.println("Smallest common factor to both 35 and 105 is "+ SimpleMathFuncs.lcf(34, 105));
		
		System.out.println("Bigest common factor to both 35 and 105 is "+ SimpleMathFuncs.gcf(34, 105));
		
	}
}