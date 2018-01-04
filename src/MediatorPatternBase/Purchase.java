package MediatorPatternBase;

import utils.Utils;

/**
 * 采购管理
 * @author Administrator
 *
 */
public class Purchase {
	//Buy IBM PC
	public void buyIBMcomputer(int number){
		//Assest stock
		Stock stock = new Stock();
		
		//Assest sale
		Sale sale = new Sale();
		
		//电脑的销售情况
		int saleStatus = sale.getStatus();
		
		if(saleStatus > 80){//销售情况良好
			Utils.p("销售良好，采购IBM电脑： " + number + "台");
			stock.increase(number);
		}else{//销售情况不好
			//采购一半就好了
			int buyNumber = number/2;
			Utils.p("销售一般，采购IBM电脑： " + buyNumber + "台");
		}
	}
	
	/**
	 * 不在采购IBM电脑，库存已满/销售为0
	 */
	public void refuseBuyIBM(){
		Utils.p("不再采购IBM电脑了");
	}
}
