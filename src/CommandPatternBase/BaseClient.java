package CommandPatternBase;

import utils.Utils;

public class BaseClient {
	public static void main(String[] args){
		Group requirementGroup = new RequirementGroup();
		
		requirementGroup.find();
		requirementGroup.add();
		requirementGroup.delete();
		requirementGroup.change();
		requirementGroup.plan();
		
		Utils.p("");
		
		Group pageGroup = new PageGroup();
		pageGroup.find();
		
		
	}

}
