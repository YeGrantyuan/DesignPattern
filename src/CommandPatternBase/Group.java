package CommandPatternBase;

public abstract class Group {
	
	/*	不管你要干嘛，你要先找到这个组	*/
	public abstract void find();
	
	/*	增加你的需求	*/
	public abstract void add();
	
	/*	删除某个需求	*/
	public abstract void delete();
	
	/*	更改某个需求	*/
	public abstract void change();
	
	/*	提出需求计划	*/
	public abstract void plan();
}
