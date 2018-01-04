package MediatorPattern.Design;

import utils.Utils;

/**
 * 采用中介者模式的采购管理
 * @author Administrator
 *
 */
public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}

	//Buy IBM PC
	public void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy", number);
	}
	
	/**
	 * 不再采购IBM电脑，库存已满/销售为0
	 */
	public void refuseBuyIBM(){
		Utils.p("不再采购IBM电脑了");
	}
}
