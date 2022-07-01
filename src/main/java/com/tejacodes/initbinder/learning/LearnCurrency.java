package com.tejacodes.initbinder.learning;

import java.util.Currency;
import java.util.Locale;

public class LearnCurrency {
	
	public static void main(String[] args) {
		
		//Way 1 to instantiate Currency class - It only allows Upper case on country codes
		Currency currency1 = Currency.getInstance("USD");
		System.out.println(currency1.getCurrencyCode());
		System.out.println(currency1.getDisplayName());
		System.out.println(currency1.getSymbol());
		
		//Way 2 to instantiate Currency class
		Currency currency2 = Currency.getInstance(Locale.JAPAN);
		System.out.println(currency2.getCurrencyCode());
		System.out.println(currency2.getDisplayName());
		System.out.println(currency2.getSymbol());
		
	}
	

}
