package MediatorPatternBase;

import utils.Utils;

public class BaseClient {
	public static void main(String[] args){
		//采购人员采购电脑
		Utils.p("------采购人员采购电脑-----");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		
		//销售人员销售电脑
		Utils.p("------销售人员销售电脑-----");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);
		
		//库存管理人员管理库存
		Utils.p("------库存管理人员管理库存-----");
		Stock stock = new Stock();
		stock.clearStock();
	}

}
