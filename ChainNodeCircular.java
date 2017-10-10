
package CircularLinkedList;

public class ChainNodeCircular {
    Object element;
    ChainNodeCircular next;
    
    ChainNodeCircular(){
        
    }
    ChainNodeCircular(Object Element){
        this.element = element;
    }
    public ChainNodeCircular(Object element, ChainNodeCircular next) {
        this.element = element;
        this.next = next;
    }
}

