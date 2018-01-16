package CompositePattern.Base;

import java.util.ArrayList;

public class Root implements IRoot {
	
	private ArrayList subordinateList = new ArrayList();
	private String name = "";
	private String position = "";
	private int salary = 0;
	
	public Root(String _name, String _position, int _salary){
		this.name = _name;
		this.position = _position;
		this.salary = _salary;
	}

	@Override
	public String getInfo() {
		String info = "";
		info = "名称： " + this.name;
		info = info + "\t职位： " + this.position;
		info = info + "\t薪资：" + this.salary;
		return info;
	}

	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}

	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}

	@Override
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}

}
