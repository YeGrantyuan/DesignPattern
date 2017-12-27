package FactoryPattern;

public class BlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	@Override
	public void talk() {
		System.out.println("黑色人会说话，一般人听不懂");
	}

}
