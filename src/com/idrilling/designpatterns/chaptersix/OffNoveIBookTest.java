package com.idrilling.designpatterns.chaptersix;

import junit.framework.TestCase;

public class OffNoveIBookTest extends TestCase{
	private IBook below40NoveIBook = new OffNoveIBook("平凡的世界", 3000,"路遥");
	private IBook above40NoveIBook = new OffNoveIBook("平凡的世界", 6000,"路遥");
	
	public void testGetPriceBelow40(){
		super.assertEquals(2400,below40NoveIBook.getPrice());
	}
	
	public void testGetPriceAbove(){
		super.assertEquals(5400,above40NoveIBook.getPrice());
	}
}
