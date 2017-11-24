package demo.service;

import java.math.BigDecimal;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;

public class WalletServiceImpl implements WalletService {

	private WalletRepo repo;
	
	public WalletServiceImpl(WalletRepo repo) {
		super();
		this.repo = repo;
	}

	public Customer createAccount(String name, String mobileNo, BigDecimal amount) {
		Customer customer = new Customer(name,mobileNo, new Wallet(amount));
		if(repo.save(customer)){
			return customer;
		}
		return null;
	}

	public Customer showBalance(String mobileNo) {
		
		return repo.findOne(mobileNo);
	}

	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) {
		Customer giver = repo.findOne(sourceMobileNo);
		Customer taker = repo.findOne(targetMobileNo);
		Wallet sourceWallet = giver.getWallet();
		Wallet targetWallet = taker.getWallet();
		
		if((sourceWallet != null && targetWallet != null) && (sourceWallet.getBalance().compareTo(amount)>=0)){
		
			sourceWallet.setBalance(sourceWallet.getBalance().subtract(amount));
			targetWallet.setBalance(targetWallet.getBalance().add(amount));
			
			
			giver.setWallet(sourceWallet);
			taker.setWallet(targetWallet);
			
			repo.save(giver);
			repo.save(taker);
			return giver;
		}
		
		return null;
	}

	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		
		Customer customer = repo.findOne(mobileNo);
		if(customer!=null && customer.getWallet()!=null){
			Wallet wallet = customer.getWallet();
			wallet.setBalance(wallet.getBalance().add(amount));
			customer.setWallet(wallet);
			repo.save(customer);
			return customer;
		}
		return null;
	}

}
