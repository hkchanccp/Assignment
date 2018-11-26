/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

/**
 *
 * @author hkcha
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data = 0;
        BinaryTree tree = new BinaryTree();
        System.out.println("Inserting :");
        for (int k = 1; k <= 10; k++) {
          data = (int)(Math.random()*100);
          System.out.print(data + " ");
          tree.insert(data);
        }
        System.out.println();
        tree.inorder();
        tree.delete(data); // delete the last inserted
        tree.inorder();
    }

       
    
    
}
