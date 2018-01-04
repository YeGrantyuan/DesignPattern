package CommandPattern.Design.SpecificCommand;


public class ChangeLogicRequirement extends Command{

	@Override
	public void execute() {
		super.rG.change();
		super.cG.change();
		super.rG.plan();
	}

}
