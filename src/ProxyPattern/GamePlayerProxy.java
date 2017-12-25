package ProxyPattern;

import utils.Utils;

/**
 * 普通代理类：调用只知道代理存在就可以，不用知道代理了谁	
 * 
 * 强制代理类：一定要通过代理访问
 */

public class GamePlayerProxy implements IGamePlayer, IProxy{

	private IGamePlayer gamePlayer = null;
	private static int timeCount = 0;
	private static boolean playerExit = false;
	
	 /* 构造函数： 通过构造函数传递被代理对象参数*/
	public GamePlayerProxy(GamePlayer _gamePlayer){
//		try{
//			gamePlayer = new GamePlayer(this, name);
//		}catch(Exception e){
//			Utils.p(e.toString());
//		}
		this.gamePlayer = _gamePlayer;
		
	}
	
	class CountTimeThread implements Runnable{

		@Override
		public void run() {
			while(playerExit){
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.toString();
				}
				
				timeCount++;
			}
		}
		
	}
	
	
	@Override
	public void login(String user, String password) {
		playerExit = true;
		new Thread(new CountTimeThread()).start();
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
		playerExit = false;
		count();
	}
	@Override
	public IGamePlayer getProxy() {
		return this;
	}
	@Override
	public void count() {
		Utils.p("升级总费用是：" + timeCount*5 + " 元");
	}

}

