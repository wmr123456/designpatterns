package com.idrilling.designpatterns.chapterfour;

public class Searcher extends AbstractSearcher{

	public Searcher(IGoodBodyGirl goodBodyGril) {
		super(goodBodyGril);
	}
	
		public Searcher(ICreatTemperamentGirl greatTemperamentGril){
			super(greatTemperamentGril);
		}
	//展示美女信息
	public void show() {
		System.out.println("-----------------------美女的信息如下：---------------------------------------");
		if(goodBodyGril!=null){
			super.goodBodyGril.goodLooking();
			super.goodBodyGril.niceFigure();
		}
		
		if(greatTemperamentGril!=null)
			super.greatTemperamentGril.greatTemperament();
	}
}
