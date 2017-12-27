package AbstractFactoryPattern;

/** 
 * 白色人种
 */

public abstract class AbstractWhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("白色人种的皮肤颜色是白色的！");
	}

	@Override
	public void talk() {
		System.out.println("白色人会说话，说得都是单字节的");
	}

}