package CommandPattern.Design.Invoker;

import CommandPattern.Design.SpecificCommand.Command;

public class Invoker {
	private Command command;
	public void setCommand(Command _command){
		this.command = _command;
	}
	
	public void action(){
		this.command.execute();
	}

}
