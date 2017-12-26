package PrototypePatternBase.common;

public class PrototypeClass implements Cloneable{
	
	/**
	 * 原型模式优点：（1）原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个
	 * 循环体中产生大量对象时，原型模式可以体现其优点。
	 * （2）逃避构造函数的约束：既是优点又是缺点
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		PrototypeClass prototypeClass = null;
		prototypeClass = (PrototypeClass)super.clone();
		return prototypeClass;
	}
	
}
