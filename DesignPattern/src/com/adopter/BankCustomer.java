package com.adopter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
	@Override
	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the account holder name");
			String customerName = br.readLine();
			System.out.println("\n");
			System.out.println("Enter the account number");
			long accno=Long.parseLong(br.readLine());
			System.out.println("Enter Bank name");
			String bankName=br.readLine();
			setAccHolderName(customerName);
			setAccNumber(accno);
			setBankName(bankName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
        long accountNo=getAccNumber();
        String accountHolderName=getAccHolderName();
        String bankName=getBankName();
		return("The Account number  "+accountNo+" of  "+accountHolderName+" bank is valid and authenticated for issueing credit card.");
	}

}
