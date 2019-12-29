package tree;

public class Tree {
	private Node root;
	
	/**
	 * Node的添加
	 * 插入之间需要判断是否为null
	 * 为null需要比较大小知道currentNode为null就插入
	 * @param iData
	 * @param dData
	 */
	public void insert(int iData,double dData) {
		//创建node节点
		Node newNode = new Node();
		newNode.iData=iData;
		newNode.dData=dData;
		
		//判断root node是否为null
		if(root==null)
		{
			root=newNode;
		}else
		{
			Node current =root;
			Node parent;
			while(true)
			{
				parent=current;//保存当current变为null之前的哪一个父节点
				if(iData<current.iData)//插入左节点
				{
					//获取当前节点的左节点，若若结点为null的话，就再parent节点下添加左节点，不然继续进行遍历
					current = current.leftNode;
					if(current==null) {
						parent.leftNode=newNode;
						return;
					}
					
				}else 
				{
					current=current.rightNode;
					if(current==null) {
						parent.rightNode=newNode;
						return ;
					}
				}
			}
		}
	}
	
	/**
	 * 查找节点
	 * @param key
	 * @return
	 */
	public Node find(int key)
	{
		Node current=root;
		while(current!=null && current.iData!=key) {
			if(current.iData<key)
			{
				current=current.rightNode;
			}else
			{
				current=current.leftNode;
			}
		}
		
		return current;
	}
	
	
	/*
	 * 树的最值查找在树中查找是比较容易的，因为从root开始查找，最小值只会出现所有父节点的左节点处，
	 * 同样最大值只会出现在所有父节点的沿着右节点搜索的最底层右节点处
	 */
	
	/**
	 * 查找树中的最大值和最小值
	 *最小值存在于一个树中的最下层的最左node
	 *最大值存在于一个树中的最大层的最右node
	 * @return
	 */
	public Node[] mVal()
	{
		Node minNode=null;
		Node maxNode=null;
		Node[] maxminNode= new Node[2];
		
		Node current=root;//从树的顶部开始搜索
		
		while(current!=null)
		{
			minNode=current;
			current=current.leftNode;
		}
		maxminNode[0] = minNode;
		//这个地方要重新从根节点开始查找
		current=root;
		while(current!=null)
		{
			maxNode=current;
			current=current.rightNode;
		}
		
		maxminNode[1] = maxNode;
		
		return maxminNode;
		
	}
	
	
	
	
	
	
}
