package com.example.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.beans.Message;
import com.example.beans.Quote;
import com.example.beans.Sender;

@RestController
public class RestConsumer {

	@RequestMapping("/")
	public String consume(){
		return "REST Consumer";
	}
	@RequestMapping(value="/quote")
	public Quote consumeQuote(){
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		return quote;
	}
	
	@RequestMapping(value="/message")
	public Message consumeMessage(){
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9090/getmessage?id=13", Message.class);
		
		
		return message;
	}
	
	@RequestMapping(value="/send")
	public Message sendMessage(){
		Message m = new Message();
		m.setText("Java client Posting message");
		m.setSender(new Sender("Java Client"));
		System.out.println(m);
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.postForObject("http://localhost:9090/receive",m, Message.class);
		
		return message;
	}
	
}
