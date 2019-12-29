package tree;

public class Node {
	public int      iData;
	public double   dData;
	public Node rightNode;
	public Node leftNode;
	
	//显示树节点信息
	public void showNode() {
		System.out.println("{"+iData+":"+dData+"}");
	}
	
	
	
}
