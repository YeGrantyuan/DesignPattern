package CommandPattern.Design;

import CommandPattern.Design.Invoker.Invoker;
import CommandPattern.Design.SpecificCommand.AddRequirementCommand;
import CommandPattern.Design.SpecificCommand.ChangeLogicRequirement;
import CommandPattern.Design.SpecificCommand.Command;
import CommandPattern.Design.SpecificCommand.DeletePageRequirement;

public class DesignClient {
	public static void main(String[] args){
		Invoker xiaoSan = new Invoker();
		
//		Command command = new AddRequirementCommand();
//		Command command = new ChangeLogicRequirement();
		Command command = new DeletePageRequirement();
		
		xiaoSan.setCommand(command);
		xiaoSan.action();
		
		

		/**
		 * 试试使用创建者模式（Buidler）来创建多个命令进行执行
		 */
		
		
	}
}
