package demo.repo;

import demo.beans.Customer;

public interface WalletRepo {
	
	public boolean save(Customer customer);
	
	public Customer findOne(String mobileNo);
}
