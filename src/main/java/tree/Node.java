package tree;

public class Node {
	public int      iData;
	public double   dData;
	public Node rightNode;
	public Node leftNode;
	
	//��ʾ���ڵ���Ϣ
	public void showNode() {
		System.out.println("{"+iData+":"+dData+"}");
	}
	
	
	
}
