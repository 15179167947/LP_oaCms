package com.sxt.sys.common;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeBuilder {

	
	
	/**
	 * 使用构造者模式把没有层级关系的集合变成有层级关系的
	 * @param treeNodes
	 * @param
	 * @return
	 */
	public static List<TreeNode> build(List<TreeNode> treeNodes,Integer topPid){
		List<TreeNode> nodes=new ArrayList<>();
		//每次循环找到一个父节点
		for (TreeNode n1 : treeNodes) {
			if(n1.getPid()==topPid) {
				nodes.add(n1);
			}
			//再次循环找到一个子节点
			for (TreeNode n2 : treeNodes) {
				if(n1.getId()==n2.getPid()) {
					//把找到的子节点加入到父节点中
					n1.getChildren().add(n2);
				}
			}
		}
		return nodes;
	}
}
