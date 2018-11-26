/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

/**
 *
 * @author hkcha
 */
public class ListQueue extends LinkedList{
    public ListQueue(){
        super();
    }
    public boolean empty(){
        return isEmpty();
    }
    public void enqueue(Object item){ 
 	// if add to head, then dequeue from tail
        addToTail(item);
    }

    public Object dequeue()throws EmptyQueueException {
        if(empty())  
            throw new EmptyQueueException();
        return removeFromHead();
    
    }

}
