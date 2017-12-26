package PrototypePatternBase;

import java.util.ArrayList;

public class Thing implements Cloneable{
	/*	定义一个私有变量	*/
	private ArrayList<String> arrayList = new ArrayList<>();

	@Override
	protected Object clone() {
		Thing thing = null;
		try{
			thing = (Thing)super.clone();
			/*	深拷贝	*/
			thing.arrayList = (ArrayList<String>) this.arrayList.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return thing;
	}
	
	/*	设置arrayList的值	*/
	public void setValue(String value){
		this.arrayList.add(value);
	}
	
	/*	取得arrayList的值	*/
	public ArrayList<String> getValue(){
		return this.arrayList;
	}

}
