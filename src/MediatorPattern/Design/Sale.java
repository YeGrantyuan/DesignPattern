package MediatorPattern.Design;

import java.util.Random;

import utils.Utils;
 
/**
 * 销售管理
 * @author Administrator
 *
 */
public class Sale extends AbstractColleague{
	
	public Sale(AbstractMediator _mediator){
		super(_mediator);
	}
	
	//销售IBM电脑
	public void sellIBMComputer(int number){

		super.mediator.execute("sale.sell", number);
		Utils.p("销售IBM电脑： " + number + "台");
	}
	
	//反馈销售情况，0~100之间变化，数字越大表示销售情况越好
	public int getSaleStatus(){
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		Utils.p("IBM电脑的销售情况: " + saleStatus);
		return saleStatus;
	}
	
	//折价处理
	public void offSale(){
		super.mediator.execute("sale.offsell");
	}
	
	
}
