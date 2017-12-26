package ProxyPattern.DynamicProxy;

import utils.Utils;

public class GamePlayer implements IGamePlayer{
	private String name = "";
	
	/*	我的代理是谁	*/
	private static GamePlayerProxy proxy = null;
	
	
	/*	通过构造函数限制谁能创建对象，并同时传递姓名	*/
	public GamePlayer(/*IGamePlayer _gamePlayer,*/ String _name){
//		if(_gamePlayer == null){
//			throw new Exception("不能创建真实角色");
//		}else{
//			this.name = _name;
//		}
		this.name = _name;
	}
	
	

	@Override
	public void login(String user, String password) {
		Utils.p("登入名为：" + user + " 的用户" + this.name);	
	}

	@Override
	public void killBoss() {
		Utils.p(this.name  + "在打怪!");
	}

	@Override
	public void upgrade(int i) {
		Utils.p(this.name + " 又升" + i + "级!");
	}
}
