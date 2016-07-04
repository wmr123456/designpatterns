package com.idrilling.designpatterns.chapterfour;

public class Client {
	public static void main(String[] args){
		//定义一个美女
		IGoodBodyGirl yanYan = new PettyGril("嫣嫣");
		AbstractSearcher seacher = new Searcher(yanYan);
		seacher.show();
	}
}
