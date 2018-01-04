package MediatorPattern.Design;

import utils.Utils;

public class Mediator extends AbstractMediator {

	/*	中间者最重要的方法	*/
	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("purchase.buy")){/* 采购电脑 */
			this.buyComputer((Integer)objects[0]);
		}else if(str.equals("sale.sell")){/* 销售电脑 */
			this.sellComputer((Integer)objects[0]);
		}else if(str.equals("sale.offsell")){/* 打折销售 */
			this.offSell();
		}else if(str.equals("stock.clear")){/* 清仓处理 */
			this.clearStock();
		}

	}

	/*	采购电脑	*/
	private void buyComputer(Integer number) {
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus > 80){/* 销售情况良好 */
			Utils.p("采购IBM电脑：" + number + " 台。");
		}else{/* 销售情况不好 */
			int buyNumber = number/2;
			Utils.p("销售情况不好, 采购IBM电脑：" + buyNumber + " 台。");
		}
	}

	/*	销售电脑	*/
	private void sellComputer(Integer number) {
		if(super.stock.getStockNumber() < number){/* 库存不够，进货 */
			super.purchase.buyIBMcomputer(number);
		}
//		super.sale.sellIBMComputer(number);
		super.stock.decrease(number);
		
	}

	/*	打折销售	*/
	private void offSell() {
		Utils.p("折价销售IBM电脑 " + stock.getStockNumber() + " 台。");
	}

	/*	清仓处理	*/
	private void clearStock() {
		/* 要求打折销售 */
		super.sale.offSale();
		
		/* 要求采购不要采购 */
		super.purchase.refuseBuyIBM();
	}

}
