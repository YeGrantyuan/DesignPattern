package ObserverPattern.RxjavaDemo;

import utils.Utils;

public class SunnyObserver implements Observer{

	@Override
	public void update(String state) {
		Utils.p("最新状态" + state);
		
	}

}
