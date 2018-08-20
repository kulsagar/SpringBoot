package com.cg.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public interface ProductSummary {
	String getName();
	
	@Value("#{@productVO.getFeedbacks(target)}")
	List<String> getFeedbacks();
}
