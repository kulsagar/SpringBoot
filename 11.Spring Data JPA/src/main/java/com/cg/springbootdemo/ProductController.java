package com.cg.springbootdemo;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Product;
import com.cg.beans.ProductSummary;
import com.cg.beans.ProductVO;
import com.cg.service.ProductRepo;

@RestController
public class ProductController {
	@Autowired
	private ProductRepo repo;
	@RequestMapping(value="/saveproduct", method=RequestMethod.POST)
	public Product saveProduct(@RequestBody Product p){
		
		return repo.save(p);
	}
	
	@RequestMapping(value="/getprods")
	public Collection<ProductSummary> getVO(){
		
		return repo.findByName("pencil");
	}
}
