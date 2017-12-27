package AbstractFactoryPattern;

public class FemaleFactory implements HumanFactory{

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
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
