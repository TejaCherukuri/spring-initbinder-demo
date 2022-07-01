package com.tejacodes.initbinder.DTO;

public class CreditCard {

	private int firstFourDigits;
	private int secondFourDigits;
	private int thirdFourDigits;
	private int lastFourDigits;
	
	public int getFirstFourDigits() {
		return firstFourDigits;
	}
	public void setFirstFourDigits(int firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}
	public int getSecondFourDigits() {
		return secondFourDigits;
	}
	public void setSecondFourDigits(int secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}
	public int getThirdFourDigits() {
		return thirdFourDigits;
	}
	public void setThirdFourDigits(int thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}
	public int getLastFourDigits() {
		return lastFourDigits;
	}
	public void setLastFourDigits(int lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}
	
	@Override
	public String toString() {
		return firstFourDigits+"-"+secondFourDigits+"-"+thirdFourDigits+"-"+lastFourDigits;
	}
	
}
