package CompositePattern.Base;

import java.util.ArrayList;

public interface IRoot {
	//Get root information
	public String getInfo();
	
	//Add branch
	public void add(IBranch branch);
	
	//Add leaf
	public void add(ILeaf leaf);
	
	//Get branch & leaf's information
	public ArrayList getSubordinateInfo();
}
