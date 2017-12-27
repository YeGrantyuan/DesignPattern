package AbstractFactoryPattern;

import utils.Utils;

public class NvWaCreateAbstractFactory {
	public static void main(String[] args){
		/* 生产男性的工厂 */
		HumanFactory maleHumanFactory = new MaleFactory();
		
		/* 生产女性的工厂 */
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		Human whiteManHuman = maleHumanFactory.createWhiteHuman();
		Human whiteFemalHhuman = femaleHumanFactory.createWhiteHuman();
		
		whiteManHuman.getColor();
		whiteManHuman.talk();
		whiteManHuman.getSix();
		
		Utils.p("");
		
		whiteFemalHhuman.getColor();
		whiteFemalHhuman.talk();
		whiteFemalHhuman.getSix();
	}
}
