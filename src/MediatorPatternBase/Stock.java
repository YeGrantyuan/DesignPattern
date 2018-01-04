package MediatorPatternBase;

import utils.Utils;

/**
 * 库存管理
 * @author Administrator
 *
 */
public class Stock {
	//刚开始有100台电脑
	private static int COMPUTER_NUMBER = 100;
	
	//库存增加
	public void increase(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		Utils.p("增加后的库存为 :" + COMPUTER_NUMBER);
	}
	
	//获得库存数量
	public int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	
	//存货压力大了，通知采购人员不要采购，销售人员尽快销售
	public void clearStock(){
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		Utils.p("清除库存，总数量为: " + COMPUTER_NUMBER);
		
		//要求折价销售
		sale.offSale();
		
		//要求采购人员不要采购
		purchase.refuseBuyIBM();
	}
}
