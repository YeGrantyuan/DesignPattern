package ChainOfResponsibilityPatternBase;

import utils.Utils;

public class Husband implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		Utils.p("女儿的请示是： " + women.getRequest());
		Utils.p("丈夫的答复是： 同意");
	}

}
