package com.abinesh.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController 
{
	private AuthenticationService authenticate;
	public LoginController(AuthenticationService authenticate) {
		super();
		this.authenticate = authenticate;
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginpage()
	{
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String welcomepage(@RequestParam String name,@RequestParam String password,ModelMap map)
	{
		if(authenticate.authentication(name, password))
		{
			map.put("name",name);
			map.put("password",password);
			return "welcome";
		}
		map.put("errormessage","Oops....Try Again!");
		return "login";
	}
}
