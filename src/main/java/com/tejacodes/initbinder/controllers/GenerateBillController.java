package com.tejacodes.initbinder.controllers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejacodes.initbinder.DTO.BillInfoDTO;
import com.tejacodes.initbinder.DTO.CreditCard;
import com.tejacodes.initbinder.propertyeditors.CurrencyPropertyEditor;

@Controller
public class GenerateBillController {
	
	@RequestMapping("/enterbillingdetails")
	public String showBillGenerationPage(@ModelAttribute BillInfoDTO billInfoDTO)
	{
		
		CreditCard creditCard = new CreditCard();
		
		creditCard.setFirstFourDigits(1234);
		creditCard.setSecondFourDigits(1234);
		creditCard.setThirdFourDigits(2345);
		creditCard.setLastFourDigits(3456);
		
		billInfoDTO.setCreditCard(creditCard);
		
		return "bill-page";
	}
	
	@RequestMapping("/generatebill")
	public String generateBill(@ModelAttribute BillInfoDTO billInfoDTO)
	{
		return "bill-generated-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		//Use CustomDateEditor to bind the date entered in the format of dd-MM-yyyy by user. Without this, the String to Date conversion by default is happening only for dd/mm/yyyy format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor = new CustomDateEditor(simpleDateFormat,true);
		binder.registerCustomEditor(Date.class, "date", customDateEditor);
		
		//Use CustomNumberEditor to bind the Amount entered by user to Amount field in the DTO. For handling user input of type 20,000.00. Any number will work with/wothout commas
		NumberFormat numberFormat = new DecimalFormat("##,###.00");
		CustomNumberEditor customNumberEditor = new CustomNumberEditor(BigDecimal.class, numberFormat, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", customNumberEditor);
		
		//Use custom currency property editor we created. Normal Currency type handles only USD but not usd. This is configured to handle usd as well
		CurrencyPropertyEditor currencyPropertyEditor = new CurrencyPropertyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyPropertyEditor);
		
		//Using initBinder to define Formatter
		//binder.addCustomFormatter(new CreditCardFormatter());
		
		// Property Editor and Formatter both does the same work
		
		//Using CreditCardPropertyEditor instead of Formatter
		//CreditCardPropertyEditor creditCardPropertyEditor = new CreditCardPropertyEditor();
		//binder.registerCustomEditor(CreditCard.class, "creditCard", creditCardPropertyEditor);
		
		//Converter also does the same work as Formatter and PropertyEditor. But we can't initialize it here. Do it in Config file
	}
}
