package AbstractFactoryPattern;

public class MaleFactory implements HumanFactory{

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Human createYelloHuman() {
		// TODO Auto-generated method stub
		return null;
	}

}
