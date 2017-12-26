package ProxyPattern;

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
	
	/*	找到自己的代理	*/
	@Override
	public IGamePlayer getProxy() {
		proxy = new GamePlayerProxy(new GamePlayer(this.name));
		return proxy;
	}
	
	/*	校验是否代理访问	*/
	private boolean hasProxy(){
		if(proxy == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public void login(String user, String password) {
		if(this.hasProxy()){
			Utils.p("登入名为：" + user + " 的用户" + this.name);	
		}else{
			Utils.p("请使用指定的代理访问");
		}
	}

	@Override
	public void killBoss() {
		if(this.hasProxy()){
			Utils.p(this.name  + "在打怪!");
		}else{
			Utils.p("请使用指定的代理访问");
		}
	}

	@Override
	public void upgrade(int i) {
		if(this.hasProxy()){
			Utils.p(this.name + " 又升" + i + "级!");
		}else{
			Utils.p("请使用指定的代理访问");
		}
	}
}
