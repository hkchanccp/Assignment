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
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create tree 
       BinaryTree tree = new BinaryTree();
       tree.insert(2);
       tree.insert(7);
       tree.insert(9);
       tree.insert(4);
       tree.insert(1);
       tree.insert(5);
       tree.insert(3);
       tree.insert(6);
       tree.insert(0);
       tree.insert(8);

       
       //inorder print
       tree.inorder();
       //preorder print
       tree.preorder();
       
       
    }
    
}
