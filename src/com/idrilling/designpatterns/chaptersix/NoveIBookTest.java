package com.idrilling.designpatterns.chaptersix;

import junit.framework.TestCase;

public class NoveIBookTest extends TestCase{
	private String name = "平凡的世界";
	private int price = 6000;
	private String author = "路遥";
	private IBook noveIBook= new NoveIBook(name,price, author);
	
	public void testGetPrice(){
		super.assertEquals(this.price,this.noveIBook.getPrice());
	}
}
