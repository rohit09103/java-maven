/**
 * 
 */
package com.localhost.java.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localhost.java.bean.HelloWorld;

/**
 * @author rohit
 *
 */
@RestController
public class HelloWorldRestController {
	
	
	@GetMapping("/")
	public HelloWorld getHelloWorld() {
		return new HelloWorld("1", "Hello World!");
	}
	
	

}
