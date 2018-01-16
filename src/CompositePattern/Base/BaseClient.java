package CompositePattern.Base;

import java.util.ArrayList;

import utils.Utils;

public class BaseClient {
	public static void main(String[] args){
		IRoot ceo = new Root("CEO_王大", "总经理", 100000);
		
		IBranch developDep = new Branch("刘达瘸子", "研发部门经理", 10000);
		IBranch saleDep = new Branch("马耳瓜子", "销售部门经理", 20000);
		IBranch finaceDep = new Branch("赵三驼子", "财务部经理", 30000);
		
		IBranch firstDevGroup = new Branch("扬三芜湖", "开发组一组长", 8000);
		IBranch secondDevGroup = new Branch("吴大棒椎", "开发组2组长", 8000);
		
		ILeaf a = new Leaf("a", "开发人员", 3000);
		ILeaf b = new Leaf("b", "开发人员", 3000);
		ILeaf c = new Leaf("c", "开发人员", 3000);
		ILeaf d = new Leaf("d", "开发人员", 3000);
		ILeaf e = new Leaf("e", "开发人员", 3000);
		ILeaf f = new Leaf("f", "开发人员", 3000);
		ILeaf g = new Leaf("g", "销售人员", 5000);
		ILeaf h = new Leaf("h", "销售人员", 6000);
		ILeaf i = new Leaf("i", "销售人员", 7000);
		ILeaf j = new Leaf("j", "财务人员", 8000);
		ILeaf k = new Leaf("k", "CEO秘书", 8000);
		ILeaf zhenlaoliu = new Leaf("郑老刘", "研发部副总", 8000);
		
		ceo.add(finaceDep);
		ceo.add(saleDep);
		ceo.add(developDep);
		ceo.add(k);
		
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		developDep.add(zhenlaoliu);
		
		finaceDep.add(j);
		
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		
		secondDevGroup.add(e);
		secondDevGroup.add(f);
		
		saleDep.add(g);
		saleDep.add(h);
		saleDep.add(i);
		
		Utils.p(ceo.getInfo());
		getAllSubordinatinate(ceo.getSubordinateInfo());
	}

	private static void getAllSubordinatinate(ArrayList subordinateInfo) {
		int length = subordinateInfo.size();
		for(int m=0; m < length; m++){
			Object s = subordinateInfo.get(m);
			if(s instanceof Leaf){
				ILeaf employee = (ILeaf)s;
				Utils.p(((Leaf) s).getInfo());
			}else{
				IBranch branch = (IBranch)s;
				Utils.p(branch.getInfo());
				getAllSubordinatinate(branch.getSubordinateInfo());
			}
		}
		
	}
}
