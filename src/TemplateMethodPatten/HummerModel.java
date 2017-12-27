package TemplateMethodPatten;

public abstract class HummerModel {
	/* 首先这个悍马模型需要可以发动起来 */
	public abstract void start();
	
	/* 能发动起来，也会停止才行  */
	public abstract void stop();
	
	/* 有个喇叭，不管是嘀嘀还是嘟嘟  */
	public abstract void alarm();
	
	/* 引擎得响，不响是假的 */
	public abstract void engineBoom();
	
	/* 车子要跑起来，不管是人推，还是电力驱动，总之要回跑  */
//	public abstract void run();
	public void run() {
		/* 首先启动 */
		this.start();
		
		/* 发动机（引擎）开始响了 */
		this.engineBoom();
		
		/* 可以跑了，遇到一条狗挡路，鸣笛 */
		if(this.needAlarm()){
			this.alarm();
		}
		
		/* 到达目的地，停车 */
		this.stop();
		
	}
	
	/*	钩子方法，约束模板方法的行为	*/
	public boolean needAlarm() {
		return true;
	}
}
