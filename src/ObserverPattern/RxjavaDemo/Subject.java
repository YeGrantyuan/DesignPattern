package ObserverPattern.RxjavaDemo;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer){
		observers.add(observer);
		Utils.p("添加一个观察者");
	}
	
	public void dettach(Observer observer){
		observers.remove(observer);
		Utils.p("移除一个观察者");
	}
	
	public void notifiedAll(String state){
		for(Observer observer : observers){
			observer.update(state);
		}
	}
}
