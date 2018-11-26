/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author hkcha
 */
import java.util.EmptyStackException;

public class ListStack extends LinkedList {

    public ListStack() {    // <== constructor, different from ListStackComp.java
		super();
    }

	public boolean empty() {
            if(isEmpty()){
                return true;
            }else{
                return false;
            }
	}

	public Object push(Object item) {
            addToHead(item);
            return item;
	}

	public Object pop() {
            Object item = removeFromHead();
            return item;
	}

	public Object peek() {
            Object item = get(0);
            return item;
	}

	public int search(Object item) {
            ListNode current = head;
            int num = -1;
            for(int i = 0;i<length;i++){
                if(item.equals(current.getData())){
                    num = i;
                }else{
                current = current.getNext();
                }       
            }
            return num; 

	}
}