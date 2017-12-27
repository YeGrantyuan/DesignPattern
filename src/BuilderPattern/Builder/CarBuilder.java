package BuilderPattern.Builder;

import java.util.ArrayList;

import BuilderPattern.CarModel.CarModel;

/**
 * 
 * @author Grantyuan
 * 抽象汽车组装者
 */
public abstract class CarBuilder {

	//建筑一个模型， 你要给我顺序要求，在这里实现
	public abstract void setSequece(ArrayList<String> sequence);
	
	//设置完毕顺序后，就可以拿到这个车辆模型进行使用了
	public abstract CarModel getCarModel();
}
