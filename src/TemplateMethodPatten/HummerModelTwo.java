package TemplateMethodPatten;

import Utils.Utils;

public class HummerModelTwo extends HummerModel{

	@Override
	public void start() {
		Utils.p("悍马H2启动HHHHHHHHHHHHHH");
	}

	@Override
	public void stop() {
		Utils.p("悍马H2停止TTTTTTTTTTTTTTT");
	}

	@Override
	public void alarm() {
		Utils.p("悍马H2鸣笛DDDDDDDDDDDDDDD");
	}

	@Override
	public void engineBoom() {
		Utils.p("悍马H2发动机启动HOHOHOHOHOHOHO");
		
	}

	/* H2启动起来  */
	@Override
	public void run() {
		/* 首先启动 */
		this.start();
		
		/* 发动机（引擎）开始响了 */
		this.engineBoom();
		
		/* 可以跑了，遇到一条狗挡路，鸣笛 */
		this.alarm();
		
		/* 到达目的地，停车 */
		this.stop();
		
	}

}
