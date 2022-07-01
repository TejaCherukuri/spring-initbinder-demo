package com.tejacodes.initbinder.converter;

import org.springframework.core.convert.converter.Converter;

import com.tejacodes.initbinder.DTO.CreditCard;

//Converter is just an another way to achieve data binding from view to DTO or vice-versa. (Just like Formatter/PropertyEditor)

public class CreditCardStringToObjectConverter implements Converter<String,CreditCard>{

	//this is same as parse() in Formatter or setAsText() in PropertyEditor
	@Override
	public CreditCard convert(String source) {
		
		String[] creditCardNums = source.split("-");
		
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(Integer.valueOf(creditCardNums[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(creditCardNums[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(creditCardNums[2]));
		creditCard.setLastFourDigits(Integer.valueOf(creditCardNums[3]));
		
		return creditCard;
	}
	
	

}
