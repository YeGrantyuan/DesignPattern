package PrototypePatternBase;

import utils.Utils;

/**
 * 浅拷贝测试
 * @author Administrator
 *
 */

public class ThingClient {
	public static void main(String[] args){
		/*	产生一个对象	*/
		Thing thing = new Thing();
		
		/*	设置一个值	*/
		thing.setValue("张三");
		
		/*	拷贝一个值	*/
		Thing cloneThing = (Thing) thing.clone();
		cloneThing.setValue("lisi");
		
		System.out.println(thing.getValue());
	}
}
