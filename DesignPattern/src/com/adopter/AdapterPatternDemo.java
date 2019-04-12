package com.adopter;

public class AdapterPatternDemo {
	public static void main(String args[]) {
          CreditCard crCard=new BankCustomer();
          crCard.giveBankDetails();
          System.out.println(crCard.getCreditCard());
	}
}
