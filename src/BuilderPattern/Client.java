package BuilderPattern;


import java.awt.image.DirectColorModel;

import utils.Utils;

import BuilderPattern.Director.Director;



public class Client {
	public static void main(String[] args){
		Director director = new Director();
		
		/*	客户需要A级benz车，就是：start --> stop*/
		director.getABenzModel().run();
		
		/*	客户要2辆B级BMW*/
		for(int i=0; i<3; i++){
			director.getBBenzModel().run();
		}
		
		/*	客户要1辆B级benz车*/
		director.getBBenzModel().run();
		
		/*	客户要一台只会跑的bwm的车*/
		director.getZBMWModel().run();
	}
}
