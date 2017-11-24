package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.beans.Message;

@Configuration
@ComponentScan(basePackages="demo")
public class AppConfig {
	
	@Bean
	public Message getMessage(){
		
		return new Message("this is mesage is displayed due to Java configuration");
	}
}
