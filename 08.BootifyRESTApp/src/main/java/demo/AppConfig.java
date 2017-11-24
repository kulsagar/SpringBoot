package demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.beans.Customer;

@Configuration

@ComponentScan(basePackages="demo")
public class AppConfig {

	@Bean(name="map")
	public Map<String,Customer> getMap(){
		
		Map<String, Customer> m = new HashMap<String,Customer>();
		m.put("9850276767", new Customer());
		
		return m;
	}
}
