package CommandPatternBase;

import utils.Utils;

public class PageGroup extends Group{
private final String GROUP_NAME = "页面美工组";
	
	@Override
	public void find() {
		Utils.p("找到" + GROUP_NAME);
	}

	@Override
	public void add() {
		Utils.p(GROUP_NAME + "添加需求+++.");
	}

	@Override
	public void delete() {
		Utils.p(GROUP_NAME + "删除需求---.");
	}

	@Override
	public void change() {
		Utils.p(GROUP_NAME + "改变需求.***");
	}

	@Override
	public void plan() {
		Utils.p(GROUP_NAME + "更新需求计划...");
	}
}
