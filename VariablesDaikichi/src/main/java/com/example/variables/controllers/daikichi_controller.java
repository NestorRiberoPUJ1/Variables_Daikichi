package com.example.variables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class daikichi_controller {

	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}

	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavours!";
	}

	@RequestMapping("/tomorrow")
	public String hola() {
		return "Tomorrow, an apportunity will arise, so be sure to be open to new ideas!";
	}

	@RequestMapping(value = "/travel/{city}", method = RequestMethod.GET)
	public String lotto(@PathVariable("city") String ciudad) {
		return "Congratulations you will soon travel to " + ciudad;
	}

	@RequestMapping(value = "/lotto/{num}", method = RequestMethod.GET)
	public String lotto(@PathVariable("num") Integer number) {

		if (number % 2 == 0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}
		return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
	}

}
