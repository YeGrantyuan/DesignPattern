package ProxyPattern;

import utils.Utils;

/**
 * 普通代理类：调用只知道代理存在就可以，不用知道代理了谁	
 * 
 * 强制代理类：一定要通过代理访问
 */

public class GamePlayerProxy implements IGamePlayer{

	private IGamePlayer gamePlayer = null;
	
	 /* 构造函数： 通过构造函数传递被代理对象参数*/
	public GamePlayerProxy(GamePlayer _gamePlayer){
//		try{
//			gamePlayer = new GamePlayer(this, name);
//		}catch(Exception e){
//			Utils.p(e.toString());
//		}
		this.gamePlayer = _gamePlayer;
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
	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
