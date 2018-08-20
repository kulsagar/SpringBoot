package com.cg.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="productVO")
public class ProductVO {

	public List<String> getFeedbacks(Product p){
		List<Feedback> f = p.getFeedback();
		List<String> fb = new ArrayList<String>();
		
		for(Feedback ff :f){
			fb.add(ff.getText());
		}
		
		return fb;
	}
	
	
}
