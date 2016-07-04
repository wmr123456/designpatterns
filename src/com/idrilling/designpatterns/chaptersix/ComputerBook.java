package com.idrilling.designpatterns.chaptersix;

public class ComputerBook implements IComputerBook{
	private String name;
	private int price;
	private String author;
	private String scope;
	
	public ComputerBook(String _name,int _price, String _author, String _scope){
		this.name = _name;
		this.price = _price;
		this.author = _author;
		this.scope = _scope;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getScope(){
		return this.scope;
	}
	
}
