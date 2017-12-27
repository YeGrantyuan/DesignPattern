package FactoryModel;

import java.util.HashMap;
import java.util.Map;

/**
 *延时加载的工厂类 
 */
public class ProductFactory {
	private static final Map<String, Product> prMap = new HashMap();
	
	/*  */
	public static synchronized Product createProduct(String type) throws Exception{
		Product product = null;
		if(prMap.containsKey(type)){
			product = prMap.get(type);
		}else{
			if(type.equals("CreateProduct")){
				product = new ConcreateProduct_one();
			}else{
				product = new ConcreateProduct_two();
			}
			
			/* 创建了对象后，把对象放进缓存容器中  */
			prMap.put(type, product);
		}
		return product;
	} 
}
