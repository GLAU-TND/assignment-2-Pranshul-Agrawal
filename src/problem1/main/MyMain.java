/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;

// executable class

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(35);
        tree.insert(11);
        tree.insert(20);
        tree.insert(34);
        tree.insert(40);

        tree.ourTraversal();
    }
}
