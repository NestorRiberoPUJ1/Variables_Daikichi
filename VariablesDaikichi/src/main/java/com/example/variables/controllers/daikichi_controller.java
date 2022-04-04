package com.example.variables.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class daikichi_controller {

	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("today")
	public String today() {
		return "Today you will find luck in all your endeavours!";
	}
	
	@RequestMapping("tomorrow")
	public String hola() {
		return "Tomorrow, an apportunity will arise, so be sure to be open to new ideas!";
	}

}
