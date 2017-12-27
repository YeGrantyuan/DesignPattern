package AbstractFactoryPattern;

import utils.Utils;

public class FemaleWhiteHuman extends AbstractWhiteHuman{

	@Override
	public void getSix() {
		Utils.p("---白人女性---");
	}
}
