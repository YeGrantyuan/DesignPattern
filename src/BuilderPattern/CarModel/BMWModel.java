package BuilderPattern.CarModel;

import Utils.Utils;

/**
 * @author Grantyuan
 * 宝马车型
 */
public class BMWModel extends CarModel{

	@Override
	protected void start() {
		Utils.p("BMW车发动起来TATATATA");
	}

	@Override
	protected void stop() {
		Utils.p("BMW车发动起来TingTingTing");
	}

	@Override
	protected void alarm() {
		Utils.p("BMW车发动起来DiDiDi");
	}

	@Override
	protected void engineBoom() {
		Utils.p("BMW车发动起来KAKAKAKA");
	}
}
