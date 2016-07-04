package com.idrilling.designpatterns.chapterfour;

public class PettyGril implements IGoodBodyGirl,ICreatTemperamentGirl{
	private String name;
	public PettyGril(String _name){
		this.name = _name;
	}
//身材好
	public void niceFigure() {
		System.out.println(this.name+"---气质非常好！");
		
	}
//气质好
	public void greatTemperament() {
		System.out.println(this.name+"---身材非常棒！");
		
	}
	//身材好
	public void goodLooking() {
		// TODO Auto-generated method stub
		
	}
}
