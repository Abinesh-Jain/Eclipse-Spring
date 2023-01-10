package com.abinesh.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class ToDo 
{
	private int id;
	private String username;
	private String discription;
	private LocalDate date;
	private boolean done;
	public ToDo(int id, String username, String discription, LocalDate date, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.discription = discription;
		this.date = date;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", discription=" + discription + ", date=" + date
				+ ", done=" + done + "]";
	}
}
