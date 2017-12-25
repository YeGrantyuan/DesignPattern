package ProxyPattern;

public interface IGamePlayer {
	/*	登入游戏	*/
	public void login(String user, String password);
	
	/*	杀怪	*/
	public void killBoss();
	
	/*	升级	*/
	public void upgrade();

}
