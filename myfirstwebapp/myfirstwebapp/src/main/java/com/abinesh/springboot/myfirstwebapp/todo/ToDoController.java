package com.abinesh.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController 
{
	private ToDoService tdserv;
	
	public ToDoController(ToDoService tdserv) {
		super();
		this.tdserv = tdserv;
	}

	@RequestMapping("todolist")
	public String listalltodo(ModelMap model)
	{
		List<ToDo> todos= tdserv.findbyusername("abinesh");
		model.addAttribute("todo",todos);
		return "todolist";
	}
	
	@RequestMapping(value="addtodo",method=RequestMethod.GET)
	public String shownewtodo()
	{
		return "todo";
	}
	
	@RequestMapping(value="addtodo",method=RequestMethod.POST)
	public String addnewtodo()
	{
		return "todolist";
	}
}
