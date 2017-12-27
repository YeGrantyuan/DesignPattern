package FactoryModel;

public class ConcreteCreate extends Creator{

	public <T extends Product> T createProduct(Class<T> c){
		Product product = null;
		try{
			product = (Product)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			//Exception deal
		}
		
		return (T)product;
	}
	
}
