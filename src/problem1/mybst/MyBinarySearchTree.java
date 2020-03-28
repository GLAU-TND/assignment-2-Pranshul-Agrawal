/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    // To insert a new Node in Tree.
    public void insert(int value){
        TreeNode node = new TreeNode(value);
        if(root == null){
            root = node;
            //System.out.println("root Node inserted");
        }
        else {
            insertHelper(root,value);
        }
    }
    private void insertHelper(TreeNode current,int value){
        TreeNode node = new TreeNode(value);
        if(value == current.getData()){
            return;
        }
        else if(value < current.getData()){
            if(current.getLeftChild() == null){
                //System.out.println("New Node inserted");
                current.setLeftChild(node);
                node.setParent(current);
            }
            else {
                insertHelper(current.getLeftChild(),value);
            }
        }
        else {
            if(current.getRightChild() == null){
                //System.out.println("New Node inserted");
                current.setRightChild(node);
                node.setParent(current);
            }
            else {
                insertHelper(current.getRightChild(),value);
            }
        }
        return;
    }
    public void ourTraversal(){
        if(isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        int counter = 0;       //counter for those Nodes who doesn't have left child.
        TreeNode current = root;
        Queue<TreeNode> leftQ = new LinkedList();
        Queue<TreeNode> rightQ = new LinkedList();
        if(current.getLeftChild() != null){
            leftQ.add(current.getLeftChild());
        }
        if(current.getRightChild() != null){
            rightQ.add(current.getRightChild());
        }
        if(leftQ.isEmpty() || rightQ.isEmpty()){
            counter++;
        }
        while(!leftQ.isEmpty() || !rightQ.isEmpty()){
            TreeNode remove_form_leftQ = null;
            TreeNode remove_from_rightQ = null;
            if (!leftQ.isEmpty()) {
                remove_form_leftQ = leftQ.remove();

                if (remove_form_leftQ.getLeftChild() != null) {
                    leftQ.add(remove_form_leftQ.getLeftChild());
                } else {
                    counter++;
                }
                if (remove_form_leftQ.getRightChild() != null) {
                    rightQ.add(remove_form_leftQ.getRightChild());
                }
                System.out.println(remove_form_leftQ);
            }

            if(!rightQ.isEmpty()) {
                remove_from_rightQ = rightQ.remove();
                //System.out.println(remove_from_rightQ);

                if (remove_from_rightQ.getLeftChild() != null) {
                    leftQ.add(remove_from_rightQ.getLeftChild());
                } else {
                    counter++;
                }
                if (remove_from_rightQ.getRightChild() != null) {
                    rightQ.add(remove_from_rightQ.getRightChild());
                }
            }
        }
        System.out.println("Count of Nodes who doesn't have Left child = "+counter);
    }
    public boolean isEmpty(){
        return root == null;
    }
    public TreeNode getRoot(){
        return root;
    }
    public void postOrderTraversal(){
        if(isEmpty()){
            System.out.println("Tree is Empty");
        }
        else {
            postOrderTraversal(root);
        }
    }
    private void postOrderTraversal(TreeNode current){
        if(current.getLeftChild() != null){
            postOrderTraversal(current.getLeftChild());
        }
        if(current.getRightChild() != null){
            postOrderTraversal(current.getRightChild());
        }
        System.out.println("data = "+current.getData());
    }
    public void preOrderTraversal(){
        if(isEmpty()){
            System.out.println("tree is empty");
        }
        else {
            preOrderTraversal(root);
        }
    }
    private void preOrderTraversal(TreeNode current){
        System.out.println("data = "+current.getData());
        if(current.getLeftChild() != null){
            preOrderTraversal(current.getLeftChild());
        }
        if(current.getRightChild() != null){
            preOrderTraversal(current.getRightChild());
        }
    }
}
