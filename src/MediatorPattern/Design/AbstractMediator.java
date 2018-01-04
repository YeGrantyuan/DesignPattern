package MediatorPattern.Design;

public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	/*	构造函数	*/
	public AbstractMediator(){
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	
	public abstract void execute(String str, Object ...objects );
}
