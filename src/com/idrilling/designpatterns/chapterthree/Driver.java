package com.idrilling.designpatterns.chapterthree;

public class Driver  implements IDriver{
	public void drive(ICar iCar){
		iCar.run();
	}
	
	//构造函数依赖传递
	/*private ICar car;
	
	public Driver(ICar _car){
		this.car = _car;
	}
	
	public void drive(){
		this.car.run();
	}*/
	
	//Setter方法传递依赖对象
	/*private ICar car;
	public void setterCar(ICar car){
		this.car = car;
	}
	public void drive(){
		this.car.run();
	}*/
	
	
}
