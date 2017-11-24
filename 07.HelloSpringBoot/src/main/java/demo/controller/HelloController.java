package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.beans.Message;

@RestController
public class HelloController {

	@Autowired
	private Message message;
	
	@RequestMapping("/")
	public String sayHello(){
		return "Hello Spring booters";
	}
	
	@RequestMapping("message")
	public Message sendMessage(){
		return message;
	}
}
