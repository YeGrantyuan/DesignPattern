package ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import ProxyPattern.DynamicProxy.GamePlayIH;

import utils.Utils;

public class Client {
	public static void main(String[] args){
		String playerName = "张三";
		
		IGamePlayer player = new GamePlayer(playerName);
		
//		IGamePlayer proxyPlayer = player.getProxy();
		
		/*	定义一个Handler	*/
		InvocationHandler handler = new GamePlayIH(player);
		
		/*	开始打游戏，记录时间	*/
		Utils.p("游戏开始时间：2017-12-20 10:30");
		
		/*	获得一个class loader	*/
		ClassLoader cl = player.getClass().getClassLoader();
		
		/**
		 * 动态产生一个代理
		 */
		IGamePlayer proxyPlayer = (IGamePlayer)Proxy.newProxyInstance(cl, 
				new Class[]{IGamePlayer.class}, handler);
		
		proxyPlayer.login("zhangSan", "password");
		
		proxyPlayer.killBoss();
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.toString();
		}
		proxyPlayer.upgrade(5000/1000);
		
		Utils.p("游戏结束时间：2017-12-20 20:18");
	}
}
