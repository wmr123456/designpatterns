package com.idrilling.designpatterns.chaptersix;

public class OffNoveIBook extends NoveIBook{
	public OffNoveIBook(String _name, int _price, String _author){
		super(_name,_price,_author);
	}
	public int getPrice(){
		int selfPrice = super.getPrice();
		int offPrice = 0;
		if(selfPrice > 4000){
			offPrice = selfPrice * 90 / 100;
		}else {
			offPrice = selfPrice * 80 /100;
		}
		return offPrice;
	}
}
