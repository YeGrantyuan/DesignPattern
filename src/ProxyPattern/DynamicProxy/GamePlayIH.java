package ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import utils.Utils;

public class GamePlayIH implements InvocationHandler{
	
	/*	被代理者	*/
	Class cls = null;
	
	/*	被代理的实例	*/
	Object obj = null;
	
	/*	我要代理谁	*/
	public GamePlayIH(Object _obj){
		this.obj = _obj;
	}

	/*	调用被代理的方法	*/
	/**
	 * invoke 方法是接口InvocationHandler定义的，必须要实现。它完成对真实方法的调用。
	 * 被代理类通过InvocationHandler接口，所有方法都由该Handler来进行处理,即所有被代理的方法都由InvocationHandler接管
	 * 实际的处理任务。
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object result = method.invoke(this.obj, args);
		
		/*	如果是登入方法，则发送信息	*/
		if(method.getName().equalsIgnoreCase("login")){
			Utils.p("有人在用我的账号");
		}
		
		return result;
	}

}
