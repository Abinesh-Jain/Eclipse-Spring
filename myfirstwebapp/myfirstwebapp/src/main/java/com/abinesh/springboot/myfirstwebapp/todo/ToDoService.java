package com.abinesh.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ToDoService 
{
	private static List<ToDo> todo=new ArrayList<>();
	static
	{
		todo.add(new ToDo(1,"abinesh","learn spring",LocalDate.now().plusYears(1),true));
		todo.add(new ToDo(2,"anon","learn css",LocalDate.now().plusYears(1),true));
		todo.add(new ToDo(3,"adam","learn sql",LocalDate.now().plusYears(1),false));
	}
	public List<ToDo> findbyusername(String name)
	{
		return todo;
	}
}
