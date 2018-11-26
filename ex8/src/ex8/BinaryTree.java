/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author hkcha
 */
public class BinaryTree {
    private BinaryNode root;

    public BinaryTree() {
        root = null;
    } 
    public boolean isEmpty() {
        return root == null; 
    }
    
    public BinaryNode search(BinaryNode t, int x){
    if (t == null)
        return null;
    if (x < t.data)
        return search(t.left, x);
    else if (x > t.data)
        return search(t.right, x);
    else
        return t;
    }
    
    //insert method
    public void insert(int d){
        root = insertSubtree(root, d);
    }
    private BinaryNode
        insertSubtree(BinaryNode t, int d)
    {
    if (t == null)
        t = new BinaryNode(d);
    else if (d < t.data)
        t.left = insertSubtree(t.left, d);
    else if (d > t.data)
        t.right = insertSubtree(t.right, d);
    return t;
    }
    
    //visit method
    private void visit(BinaryNode t) {
        System.out.print(Integer.toString(t.data));
    }
    
    //preorder method
    public void preorder() {
        preorderSubtree(root);
        System.out.println();
    }
    
    private void preorderSubtree(BinaryNode t){
        if (t == null) return;
        visit(t);
        preorderSubtree(t.left);
        preorderSubtree(t.right);
    }
    
    // Inorder method
    public void inorder() {
        inorderSubtree(root);
        System.out.println();
    }
    private void inorderSubtree(BinaryNode t) {
        if (t == null) return;
        inorderSubtree(t.left);
        visit(t);
        inorderSubtree(t.right);
    }
}
