package com.idrilling.designpatterns.chapterthree;

public class Client {
	public static void main(String[] args){
		Driver zhangSan = new Driver();
		ICar car = new BMW();; 
		zhangSan.drive(car);
	}
}
