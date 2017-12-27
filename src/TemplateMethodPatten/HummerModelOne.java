package TemplateMethodPatten;

import utils.Utils;

public class HummerModelOne extends HummerModel{
	private boolean alarmFlag;

	@Override
	public void start() {
		Utils.p("悍马H1启动HHHHHHHHHHHHHH");
	}

	@Override
	public void stop() {
		Utils.p("悍马H1停止TTTTTTTTTTTTTTT");
	}

	@Override
	public void alarm() {
		if(this.alarmFlag){
			Utils.p("悍马H1鸣笛DDDDDDDDDDDDDDD");
		}
	}

	@Override
	public void engineBoom() {
		Utils.p("悍马H1发动机启动HOHOHOHOHOHOHO");
		
	}

	@Override
	public boolean needAlarm() {
		return this.alarmFlag;
	}
	
	/*	真正是否需要鸣笛，由客户决定	*/
	public void setAlarmFalg(boolean setAlarm){
		this.alarmFlag = setAlarm;
	}

	

}
