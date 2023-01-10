package com.abinesh.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService 
{
	public boolean authentication(String name,String password)
	{
		boolean isvaliduser=name.equalsIgnoreCase("abinesh");
		boolean isvalidpass=password.equalsIgnoreCase("pass");
		return isvaliduser&&isvalidpass;
	}
}
