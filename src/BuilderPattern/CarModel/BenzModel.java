package BuilderPattern.CarModel;

import Utils.Utils;

/**
 * @author Grantyuan
 * 奔驰模型
 */
public class BenzModel extends CarModel{

	@Override
	protected void start() {
		Utils.p("BenZ车发动起来HHHHHHHH");
	}

	@Override
	protected void stop() {
		Utils.p("BenZ车停下来-----");
	}

	@Override
	protected void alarm() {
		Utils.p("BenZ车鸣笛DD、DD");
	}

	@Override
	protected void engineBoom() {
		Utils.p("BenZ车的发动机是安静的 EEE");
	}

}
