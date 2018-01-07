package ChainOfResponsibilityPatternBase;

import utils.Utils;

public class Father implements IHandler {

	@Override
	public void HandleMessage(IWomen women) {
		Utils.p("女儿的请示是： " + women.getRequest());
		Utils.p("父亲的答复是： 同意");
	}
}
