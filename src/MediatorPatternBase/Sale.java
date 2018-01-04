package MediatorPatternBase;

import java.util.Random;

import utils.Utils;
 
/**
 * 销售管理
 * @author Administrator
 *
 */
public class Sale {
	
	//访问库存
	private Stock stock = new Stock();

	//销售IBM电脑
	public void sellIBMComputer(int number){
//		//访问库存
//		Stock stock = new Stock();
		
		//访问采购
		Purchase purchase = new Purchase();
		
		if(stock.getStockNumber() < number){//销售的数量大于库存数量
			//催促采购
			purchase.buyIBMcomputer(number);
		}
		
		Utils.p("销售IBM电脑： " + number + "台");
	}
	
	//反馈销售情况，0~100之间变化，数字越大表示销售情况越好
	public int getStatus(){
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		Utils.p("IBM电脑的销售情况: " + saleStatus);
		return saleStatus;
	}
	
	//折价处理
	public void offSale(){
		//库房有多少卖多少
		stock.getStockNumber();
		Utils.p("折价销售IBM电脑：" + stock.getStockNumber() + "台");
	}
	
	
}
