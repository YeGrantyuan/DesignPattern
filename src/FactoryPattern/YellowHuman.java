package FactoryPattern;

public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黑色的！");
	}

	@Override
	public void talk() {
		System.out.println("黄色会说话，一般说得都是双字节！");
	}

}