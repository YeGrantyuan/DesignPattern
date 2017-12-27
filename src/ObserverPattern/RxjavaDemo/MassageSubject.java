package ObserverPattern.RxjavaDemo;

public class MassageSubject extends Subject{
	
	public void change(String state){
		notifiedAll(state);
	}

}
