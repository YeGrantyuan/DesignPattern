package ChainOfResponsibilityPatternBase;

import java.util.ArrayList;
import java.util.Random;

import utils.Utils;

public class Client {
	public static void main(String[] args){
		String WOMEN_REQUEST = "我要出去逛街";
		
		/* 随机挑选几个女性 */
		Random random = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<>();
		
		for(int i=0; i<5; i++){
			arrayList.add(new Women(random.nextInt(5), WOMEN_REQUEST));
		}
		
		//定义三个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		
		for(IWomen women : arrayList){
			switch (women.getType()) {
				case 1:
					father.HandleMessage(women);
					Utils.p("");
					break;
					
				case 2:
					husband.HandleMessage(women);
					Utils.p("");
					break;
					
				case 3:
					son.HandleMessage(women);
					Utils.p("");
					break;
	
				default:
					Utils.p("Error \n");
					break;
			}
		}
	}
}
