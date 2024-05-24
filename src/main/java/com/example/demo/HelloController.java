package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
* Hello world!
*
*/
@RestController
public class HelloController 
{
	@RequestMapping("/taro")
	public String taro() {
		return "Taro desu!";
	}
}
