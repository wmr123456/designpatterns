package com.idrilling.designpatterns.chapterfour;

public abstract class AbstractSearcher {
	protected IGoodBodyGirl goodBodyGril;
	protected ICreatTemperamentGirl greatTemperamentGril;
	public AbstractSearcher(IGoodBodyGirl goodBodyGril){
		this.goodBodyGril = goodBodyGril;
	}
	
	public AbstractSearcher(ICreatTemperamentGirl greatTemperamentGril){
		this.greatTemperamentGril = greatTemperamentGril;
		
	}
	
	public AbstractSearcher(ICreatTemperamentGirl greatTemperamentGril,IGoodBodyGirl goodBodyGril){
		this.goodBodyGril = goodBodyGril;
		this.greatTemperamentGril = greatTemperamentGril;
	}
	//搜索美女，列出美女信息
	public abstract void show();
}
