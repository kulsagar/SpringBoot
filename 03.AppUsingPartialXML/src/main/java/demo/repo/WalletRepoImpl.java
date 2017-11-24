package demo.repo;

import java.util.Map;

import javax.annotation.*;
import org.springframework.stereotype.Repository;

import demo.beans.Customer;

@Repository
public class WalletRepoImpl implements WalletRepo {
	
	@Resource(name="map")
	private Map<String,Customer> data;
	
	public WalletRepoImpl(){
		
	}
	public WalletRepoImpl(Map<String, Customer> data) {
		super();
		this.data = data;
	}

	public boolean save(Customer customer) {
		data.put(customer.getMobileNo(), customer);
		return true;
	}

	public Customer findOne(String mobileNo) {
		return data.get(mobileNo);
	}

}
