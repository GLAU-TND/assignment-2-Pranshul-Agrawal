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
            //insertHelper(root,value);
        }
    }
}
