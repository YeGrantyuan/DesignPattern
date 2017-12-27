package TemplateMethodPatten;

public class EG_Client {
	public static void main(String[] args){
		EG_TemplateAbstractClass classOne = new EG_SpecificConcreteClassOne();
		EG_TemplateAbstractClass classTwo = new EG_SpecificConcreteClassTwo();
		
		/*	调用模板方法	*/
		classOne.templateMethod();
		classTwo.templateMethod();
	}

}
