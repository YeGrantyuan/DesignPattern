package AbstractFactoryPattern;

import utils.Utils;

public class MaleWhiteHuman extends AbstractWhiteHuman{

	@Override
	public void getSix() {
		Utils.p("+++白人男性+++");
	}
}
