package TemplateMethodPatten;

public abstract class EG_TemplateAbstractClass {
	/*	基本方法一	*/
	protected abstract void doSomething();
	
	/*	基本方法二	*/
	protected abstract void doAnything();
	
	/*	模板方法	*/
	public void templateMethod(){
		/**
		 *	调用基本方法，完成相关逻辑 
		 */
		
		this.doSomething();
		
		this.doAnything();
	}

}
