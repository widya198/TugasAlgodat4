
package DoubleLinkedList;


public class ChainNodeDouble {
    Object element;
    ChainNodeDouble next, prev;
    
    ChainNodeDouble(){
        
    }
    ChainNodeDouble(Object Element){
        this.element = element;
    }
    public ChainNodeDouble(Object element, ChainNodeDouble next, ChainNodeDouble prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}

