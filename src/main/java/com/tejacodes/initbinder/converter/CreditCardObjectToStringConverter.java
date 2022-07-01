package com.tejacodes.initbinder.converter;

import org.springframework.core.convert.converter.Converter;

import com.tejacodes.initbinder.DTO.CreditCard;

public class CreditCardObjectToStringConverter implements Converter<CreditCard,String>{

	//This is same as print() in Formatter or getAstext() of Property Editor
	@Override
	public String convert(CreditCard source) {
		
		return "sample:"+source;
		
	}

}
