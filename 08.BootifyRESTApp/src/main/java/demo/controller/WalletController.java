package demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.beans.Customer;
import demo.beans.TestBean;
import demo.service.WalletService;

@RestController
public class WalletController {

	@Autowired
	private WalletService service;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Customer test(){
		Customer c = service.createAccount("Sagar", "9850276767", new BigDecimal(2000));
		return c;
	}

	@RequestMapping(value="/c", method=RequestMethod.GET)
	public Customer createAccount(){
		Customer c = service.createAccount("Sagar", "9850276767", new BigDecimal(2000));
		return c;
	}

	@RequestMapping(value="/s", method=RequestMethod.GET)
	public Customer showBalance(){
		return service.showBalance("9850276767");
	}

	@RequestMapping(value="/d", method=RequestMethod.GET)
	public Customer deposit(){
		return service.depositAmount("9850276767", new BigDecimal(1500));
	}

	@RequestMapping(value="/f", method=RequestMethod.GET)
	public Customer fundTransfer(){
		service.createAccount("Renu", "9604744104",new BigDecimal(5000));
		return service.fundTransfer("9850276767", "9604744104", new BigDecimal(1500));
	}

}
