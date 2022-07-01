package com.tejacodes.initbinder.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.tejacodes.initbinder.DTO.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard>{

	@Override
	public String print(CreditCard creditCard, Locale locale) {
		
		/* return  Integer.toString(creditCard.getFirstFourDigits())+"-"+
				Integer.toString(creditCard.getSecondFourDigits())+"-"+
				Integer.toString(creditCard.getThirdFourDigits())+"-"+
				Integer.toString(creditCard.getLastFourDigits());
				*/
		return creditCard.toString();
	}

	@Override
	public CreditCard parse(String creditCardNumber, Locale locale) throws ParseException {
		
		String[] creditCardNums = creditCardNumber.split("-");
		
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(Integer.valueOf(creditCardNums[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(creditCardNums[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(creditCardNums[2]));
		creditCard.setLastFourDigits(Integer.valueOf(creditCardNums[3]));
		
		return creditCard;
	}
	
	

}
