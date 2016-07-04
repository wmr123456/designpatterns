package com.idrilling.designpatterns.chaptersix;

public class NoveIBook implements IBook{
	private String name;
	private int price;
	private String author;
	
	public NoveIBook(String _name, int _price, String _author){
		this.name = _name;
		this.price = _price;
		this.author = _author;
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
}
