package FactoryModel;
/**
 *抽象工厂 
 */
public abstract class Creator {
	/* *
	 * 创建一个产品对象，其输入参数类型可以自行设置
	 * 通常为String、 Emum、 Class等， 当然也可以为空 
	 */
	public abstract <T extends Product> T createProduct(Class <T> c);
}