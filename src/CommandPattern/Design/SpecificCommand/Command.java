package CommandPattern.Design.SpecificCommand;

import CommandPattern.Design.Group.CodeGroup;
import CommandPattern.Design.Group.PageGroup;
import CommandPattern.Design.Group.RequirementGroup;


public abstract class Command {
	/**
	 * protected的类、类属变量及方法，包内的任何类，及包外的那些继承了此类的子类才能访问；
	 * 
	 * 把三个类先定义好，子类可以直接用
	 */
	protected CodeGroup cG = new CodeGroup();
	protected RequirementGroup rG = new RequirementGroup();
	protected PageGroup pG = new PageGroup();
	
	public abstract void execute();
}
