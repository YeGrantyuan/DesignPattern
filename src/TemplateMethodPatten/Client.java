package TemplateMethodPatten;

import utils.Utils;

public class Client {
	public static void main(String[] args){
		HummerModel hummerOne = new HummerModelOne();
		hummerOne.run();
		Utils.p("");
		HummerModel hummerTwo = new HummerModelTwo();
		hummerTwo.run();
	}
}
