package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.beans.Message;

@Controller
public class JspController {

	@RequestMapping(value="/welcome")
	public String showWelcomePage(Integer id, ModelMap model){
		
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9090/getmessage?id="+id, Message.class);
		System.out.println(message);
		model.put("message", message);
		return "welcome";
	}
}
