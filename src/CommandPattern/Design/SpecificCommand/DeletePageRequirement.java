package CommandPattern.Design.SpecificCommand;


public class DeletePageRequirement extends Command{

	@Override
	public void execute() {
		super.rG.find();
		super.rG.change();
		super.pG.delete();
		super.rG.plan();
	}

}
