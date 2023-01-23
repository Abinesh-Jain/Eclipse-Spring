package com.abinesh.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SayHelloController 
{
	@RequestMapping("/hello")
	@ResponseBody
	public String say()
	{
		return "Hello!";
	}
	@RequestMapping("/helloJSP")
	public String sayhello()
	{
		return "sayhello";
	}
}
