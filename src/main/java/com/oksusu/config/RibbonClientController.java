package com.oksusu.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonClientController {
	@RequestMapping(value = "/")
	public String home() {
		return "Okay!";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		return "Okay Test";
	}
}