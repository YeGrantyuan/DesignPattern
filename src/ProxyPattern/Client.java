package ProxyPattern;

import utils.Utils;

public class Client {
	public static void main(String[] args){
		String playerName = "张三";
		
		IGamePlayer player = new GamePlayer(playerName);
		
		IGamePlayer proxyPlayer = player.getProxy();
		
		Utils.p("游戏开始时间：2017-12-20 10:30");
		
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
