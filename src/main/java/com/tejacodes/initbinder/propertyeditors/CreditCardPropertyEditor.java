package com.tejacodes.initbinder.propertyeditors;

import java.beans.PropertyEditorSupport;

import com.tejacodes.initbinder.DTO.CreditCard;

public class CreditCardPropertyEditor extends PropertyEditorSupport{
	
	// Method is to convert DTO to String for displaying in view - similar to print() in Formatter
	@Override
	public String getAsText() {
		
		CreditCard creditCard = (CreditCard)getValue();
		return creditCard.toString();
	}
	
	//Method to convert String to DTO object -- similar to parse() in Formatter
	@Override
	public void setAsText(String creditCardNumber) throws IllegalArgumentException {
		
		String[] creditCardNums = creditCardNumber.split("-");
		
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(Integer.valueOf(creditCardNums[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(creditCardNums[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(creditCardNums[2]));
		creditCard.setLastFourDigits(Integer.valueOf(creditCardNums[3]));
		
		setValue(creditCard);
	}

}
