package tree;

public class MainTest {
	public static void main(String[] args) {
		Tree tree=new Tree();
        tree.insert(3, 3.666);
        tree.insert(1, 1.111);
        tree.insert(2, 2.362);
        tree.insert(4, 4.672);
        tree.insert(5, 5.865);
        tree.insert(6, 6.681);
        Node node=tree.find(3);
        if(node==null)
        {
            System.out.println("we can not find it");
        }else
        {
            node.showNode();
        }
		
		  //查找tree中的最值
        Node[] temp=tree.mVal();
        temp[0].showNode();
        temp[1].showNode();
		 

	}
}
