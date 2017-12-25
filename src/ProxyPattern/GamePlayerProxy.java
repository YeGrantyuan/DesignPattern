package ProxyPattern;

import utils.Utils;

/**
 * 普通代理类：调用只知道代理存在就可以，不用知道代理了谁	
 */

public class GamePlayerProxy implements IGamePlayer{

	private IGamePlayer gamePlayer = null;
	
	 /* 构造函数： 通过构造函数传递被代理对象参数*/
	public GamePlayerProxy(String name){
		try{
			gamePlayer = new GamePlayer(this, name);
		}catch(Exception e){
			Utils.p(e.toString());
		}
	}
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
