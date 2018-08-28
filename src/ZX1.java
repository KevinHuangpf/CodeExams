import java.util.*;

/** 中兴通讯2018秋招笔试题目1:输出每个工程师层级顺序的最小信号强度
 * @author  KevinHuang
 * @date 2018/8/28
 * @version 1.0
 *
 * */
//intput：network = 111110000010000
//output： [3,2,4,3,3,4]

public class ZX1 {
    public static void main(String[] args) {

        //完成输入
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        String zeroOnes = strings[strings.length-1];
        int[] array = new int[zeroOnes.length()];
        for (int i = 0; i < zeroOnes.length(); i++) {
            if(zeroOnes.charAt(i)=='1'){
                array[i]=i;
            }
        }

        //建立二叉树
        ZX1 m=new ZX1();
        Node aRoot=m.createTree(array);
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Node> laywerNode = LaywerTraversal(aRoot);


        //寻找当前节点的最远节点并添加到数组
        for(int i=0;i<laywerNode.size();i++){
            int disMax =0;
            for (int j = 0; j < laywerNode.size(); j++) {
                int cur =distanceNodes(aRoot,laywerNode.get(i).data,laywerNode.get(j).data);
                if(cur>disMax)
                    disMax=cur;
            }
            arrayList.add(disMax);
        }

        //输出结果
        System.out.println(arrayList);

    }

    //层次遍历二叉树
    public static LinkedList<Node> LaywerTraversal(Node root){
        if(root==null) return null;
        LinkedList<Node> res= new LinkedList<>();
        LinkedList<Node> list= new LinkedList<>();
        list.add(root);
        Node currentNode;
        while(!list.isEmpty()){
            currentNode=list.poll();
            res.add(currentNode);
            if(currentNode.left!=null){
                list.add(currentNode.left);
                //System.out.println("in");
            }
            if(currentNode.right!=null){
                list.add(currentNode.right);
            }
        }

        return res;
    }




    //根据01字符串建立二叉树
    public Node createTree(int[] data){
        List<Node> nodeList=new ArrayList<Node>();
        for(int each:data){
            Node n=new Node(each);
            nodeList.add(n);
        }
        int lastRootIndex=data.length/2-1;
        for(int i=0;i<=lastRootIndex;i++){
            Node root=nodeList.get(i);
            Node left=nodeList.get(i*2+1);
            if(left.getData()!=0){
                root.setLeft(left);
            }else{
                root.setLeft(null);
            }
            if(i*2+2<data.length){
                Node right=nodeList.get(i*2+2);
                if(right.getData()!=0){
                    root.setRight(right);
                }else{
                    root.setRight(null);
                }
            }

        }
        Node root=nodeList.get(0);
        return root;
    }


    //求任意节点之间的距离
    public static int distanceNodes(Node root,int node1, int node2) {

        Node lca = findLCA(root, node1, node2);
        int dis_lca = findLevel(root, lca.data);
        int dis1 = findLevel(root, node1);
        int dis2 = findLevel(root, node2);
        return dis1 + dis2 - 2 * dis_lca;


    }

    //返回node节点在root中的第几层，-1表示没有在root子树下找到
    public static int findLevel(Node root, int node) {
        if (root == null) return -1;
        if (root.data == node) return 0;
        //先在左子树查找
        int level = findLevel(root.left, node);
        //左子树没有找到则到右子树查找
        if (level == -1) {
            level = findLevel(root.right, node);
        }

        if (level != -1)
            return level + 1;
        return -1;

    }

    //确定距离
    public static Node findLCA(Node root, int node1, int node2) {

        if (root == null) return null;

        //找到两个节点中的一个就返回
        if (root.data == node1 || root.data == node2) {
            return root;
        }


        //分别在左右子树查找两个节点
        Node left_lca = findLCA(root.left, node1, node2);
        Node right_lca = findLCA(root.right, node1, node2);
        if (left_lca != null && right_lca != null) {
            //此时说明，两个节点肯定是分别在左右子树中，当前节点比为LCA
            return root;
        }
        return left_lca != null ? left_lca : right_lca;
    }



    //二叉树的定义
    class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int i){
            data=i;
        }

        public int getData() {
            return data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
        public Node getRight() {
            return right;
        }
        public void setRight(Node right) {
            this.right = right;
        }
    }


}
