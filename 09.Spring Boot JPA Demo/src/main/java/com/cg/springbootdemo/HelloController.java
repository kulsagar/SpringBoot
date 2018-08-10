package com.cg.springbootdemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Message;
import com.cg.beans.Sender;
import com.cg.service.MessageRepo;

@RestController
public class HelloController {
	
	@Autowired
	private MessageRepo repo;
	
	
	@RequestMapping("/")
	public String sayHello(){
		
		return "Spring Boot is cool...";
	}
	
	@RequestMapping(value="/message")
	public Message sendMessage(){
		return new Message("Message from SpringBoot APP",new Sender("Hitesh"));
	}
	
	@RequestMapping(value="/receive", method=RequestMethod.POST)
	public Message receiveMessage(@RequestBody Message message){
		repo.save(message);
		return message;
	}

	
	
	
	
	
	@RequestMapping("/getmessage")
	public Message getMessage(int id){
		
		return repo.getOne(id);
	}
}























