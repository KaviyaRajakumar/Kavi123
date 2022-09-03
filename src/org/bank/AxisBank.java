package org.bank;

public class AxisBank extends BankInfo{
	
	
	@Override
	public void deposit() {
		
	System.out.println("5%");	
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.savings();
		a.deposit();
		a.fixed();
	}

}
