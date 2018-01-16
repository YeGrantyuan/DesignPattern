package CompositePattern.Base;

import java.util.ArrayList;

public interface IBranch {
	//Get branch information
	public String getInfo();
	
	//Add sub branch 
	public void add(IBranch branch);
	
	//Add leaives
	public void add(ILeaf leaf);
	
	//Return all
	public ArrayList getSubordinateInfo();
}
