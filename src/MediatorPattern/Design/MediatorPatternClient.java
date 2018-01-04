package MediatorPattern.Design;

import utils.Utils;

public class MediatorPatternClient {
	public static void main(String[] args){
		AbstractMediator _mediator = new Mediator();
		
		Purchase purchase = new Purchase(_mediator);
		Sale sale = new Sale(_mediator);
		Stock stock = new Stock(_mediator);
		
		//采购人员采购电脑
		Utils.p("------采购人员采购电脑-----");
		purchase.buyIBMcomputer(100);
		
		//销售人员销售电脑
		Utils.p("------销售人员销售电脑-----");
		sale.sellIBMComputer(90);
		
		//库存管理人员管理库存
		Utils.p("------库存管理人员管理库存-----");
		stock.getStockNumber();
		stock.clearStock();
	}

}
