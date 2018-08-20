	package com.cg.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.Product;
import com.cg.beans.ProductSummary;
import com.cg.beans.ProductVO;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	
	Collection<ProductSummary> findByName(String name);
}
