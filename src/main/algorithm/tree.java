package main.algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class tree {
    private char date;
    private tree lchild;   //左孩子
    private tree rchild;   //右孩子

    private tree(char c ){
        date = c;
    }


    public static void BFSOrder(tree T)
    {
        if(T==null) return ;
        Queue<tree> queue = new ArrayDeque<tree>();
        //队列小知识：使用offer和poll优于add和remove之处在于它们返回值可以判断成功与否，而不抛出异常

        queue.offer(T);              //算法1：根结点进入队列
        while(!queue.isEmpty())      //算法2：若队列非空，循环执行步骤 3-5，否则执行步骤6
        {
            T=queue.poll();          //算法3：将一个结点出队列，并访问该结点
            System.out.print(T.date);
            if(T.lchild!=null)       //算法4：若该结点的左子树为非空，则将该结点的左孩子结点入队列；
                queue.offer(T.lchild);
            if(T.rchild!=null)       //算法5：若该结点的左子树为非空，则将该结点的右孩子结点入队列；
                queue.offer(T.rchild);
        }
        //步骤6结束
    }



    public static void main(String[] args) {
        tree b1 = new tree('a');
        tree b2 = new tree('b');
        tree b3 = new tree('c');
        tree b4 = new tree('d');
        tree b5 = new tree('e');
        tree b6 = new tree('f');
        tree b7 = new tree('g');

        /**
         *      a
         *    /   \
         *   b     c
         *  / \   / \
         * d   e f   g
         */
        b1.lchild = b2;
        b1.rchild = b3;
        b2.lchild = b4;
        b2.rchild = b5;
        b3.lchild = b6;
        b3.rchild = b7;

        tree.BFSOrder(b1);
        System.out.println();
    }

}
