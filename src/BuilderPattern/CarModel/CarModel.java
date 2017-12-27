package BuilderPattern.CarModel;

import java.util.ArrayList;

public abstract class CarModel {
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	//这个模型开始跑起来
	protected abstract void start();
	
	//能跑起来，也要能停下，才是真本事
	protected abstract void stop();
	
	//喇叭响起来，哔哔还是嘀嘀
	protected abstract void alarm();
	
	//引擎轰轰的响起来，这是台汽车
	protected abstract void engineBoom();
	
	//模型会跑，不管是人力还是电力还是汽油
	final public void run(){
		//通过循环决定：谁在前，就执行谁
		for(int i = 0; i < this.sequence.size(); i++){
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				//启动汽车
				this.start();
			}else if(actionName.equalsIgnoreCase("stop")){
				//停下来
				this.stop();
			}else if(actionName.equalsIgnoreCase("alarm")){
				//响喇叭
				this.alarm();
			}else if(actionName.equalsIgnoreCase("engine boom")){
				//如果是引擎关键字，引擎就响
				this.engineBoom();
			}
		}
	}
	
	//把传递进来的值传递到内部类;允许客户自行设定顺序
	final public void setSequence(ArrayList<String> sequence){
		this.sequence = sequence;
	}
}
