package tree;

public class Tree {
	private Node root;
	
	/**
	 * Node�����
	 * ����֮����Ҫ�ж��Ƿ�Ϊnull
	 * Ϊnull��Ҫ�Ƚϴ�С֪��currentNodeΪnull�Ͳ���
	 * @param iData
	 * @param dData
	 */
	public void insert(int iData,double dData) {
		//����node�ڵ�
		Node newNode = new Node();
		newNode.iData=iData;
		newNode.dData=dData;
		
		//�ж�root node�Ƿ�Ϊnull
		if(root==null)
		{
			root=newNode;
		}else
		{
			Node current =root;
			Node parent;
			while(true)
			{
				parent=current;//���浱current��Ϊnull֮ǰ����һ�����ڵ�
				if(iData<current.iData)//������ڵ�
				{
					//��ȡ��ǰ�ڵ����ڵ㣬�������Ϊnull�Ļ�������parent�ڵ��������ڵ㣬��Ȼ�������б���
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
	 * ���ҽڵ�
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
	 * ������ֵ���������в����ǱȽ����׵ģ���Ϊ��root��ʼ���ң���Сֵֻ��������и��ڵ����ڵ㴦��
	 * ͬ�����ֵֻ����������и��ڵ�������ҽڵ���������ײ��ҽڵ㴦
	 */
	
	/**
	 * �������е����ֵ����Сֵ
	 *��Сֵ������һ�����е����²������node
	 *���ֵ������һ�����е����������node
	 * @return
	 */
	public Node[] mVal()
	{
		Node minNode=null;
		Node maxNode=null;
		Node[] maxminNode= new Node[2];
		
		Node current=root;//�����Ķ�����ʼ����
		
		while(current!=null)
		{
			minNode=current;
			current=current.leftNode;
		}
		maxminNode[0] = minNode;
		//����ط�Ҫ���´Ӹ��ڵ㿪ʼ����
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
