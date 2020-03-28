package problem4.myqueue;
import com.sun.source.tree.Tree;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.element.Element;

import java.util.LinkedList;
import java.util.List;

public class MyQueue <T>{
    private Element front;
    private Element back;
    private MyBinarySearchTree tree;
    public MyQueue(MyBinarySearchTree tree){
        this.tree = tree;
    }
    public <T>void add(Element ele){
        if(isEmpty()){
            front = ele;
            back = ele;
        }
        else {
            back.setNext(ele);
            back = ele;
        }
    }
    public boolean isEmpty(){
        return front == null;
    }

}
