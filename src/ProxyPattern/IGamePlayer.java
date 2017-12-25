package ProxyPattern;

public interface IGamePlayer {
	/*	登入游戏	*/
	public void login(String user, String password);
	
	/*	杀怪	*/
	public void killBoss();
	
	/*	升级	*/
	public void upgrade();
	
	/*	【强制代理】 每个人都以找一下自己的代理	*/
	public IGamePlayer getProxy();

}
