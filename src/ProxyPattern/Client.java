package ProxyPattern;

import utils.Utils;

public class Client {
	public static void main(String[] args){
		String playerName = "张三";
		
		IGamePlayer proxyPlayer = new GamePlayerProxy(playerName);
		
		Utils.p("游戏开始时间：2017-12-20 10:30");
		
		proxyPlayer.login("zhangSan", "password");
		
		proxyPlayer.killBoss();
		
		proxyPlayer.upgrade();
		
		Utils.p("游戏结束时间：2017-12-20 20:18");
	}
}
