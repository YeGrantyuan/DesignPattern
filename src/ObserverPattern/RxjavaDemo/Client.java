package ObserverPattern.RxjavaDemo;

public class Client {

	public static void main(String[] args){
		String state = "我在大保健";
		
		Observer observer = new SunnyObserver();
		MassageSubject massageSubject = new MassageSubject();
		
		massageSubject.attach(observer);
		massageSubject.change(state);
		
	}
}
