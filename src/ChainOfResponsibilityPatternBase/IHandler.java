package ChainOfResponsibilityPatternBase;

public interface IHandler {
	//一个女性要求逛街，你要处理
	public void HandleMessage(IWomen women);
}
