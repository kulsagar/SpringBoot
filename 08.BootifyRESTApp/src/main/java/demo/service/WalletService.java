package demo.service;

import java.math.BigDecimal;

import demo.beans.Customer;

public interface WalletService {

	public Customer createAccount(String name, String mobileNo, BigDecimal amount);
	
	public Customer showBalance(String mobileNo);
	
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount);
	
	public Customer depositAmount(String mobileNo, BigDecimal amount);
}
