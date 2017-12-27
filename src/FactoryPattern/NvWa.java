package FactoryPattern;

import Utils.Utils;

public class NvWa {
	public static void  main(String[] args){
		/* 声明八卦阴阳炉 */
		AbstractHumanFactory yinYangLu = new HumanFactory();
		
		/* 女娲第一次造人， 火候 不足， 于是白人诞生了  */
		Utils.p("-- 造出第一批人是白人 --");
		Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		/* 女娲第二次造人， 火候过大， 于是黑人诞生了  */
		Utils.p("-- 造出第一批人是黑人 --");
		Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		/* 女娲第三次造人， 火候刚刚好， 于是黄人诞生了  */
		Utils.p("-- 造出第三批人是黄人 --");
		Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}
