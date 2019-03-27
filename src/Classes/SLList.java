package Classes;

import java.util.ArrayList;

public class SLList<E> {
    private static class Node<E> {
        private E element; 
        private Node<E> next;
        public Node(E element, Node<E> next) {
            super();
            this.element = element;
            this.next = next;
        }
        public Node(E element) { this(element, null); } 
        public Node() { this(null, null); }
        public E getElement() { return element; }
        public void setElement(E element) { this.element = element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> next) { this.next = next; }    
    }

    private Node<E> first = null; 
    private int size = 0;     
    public void addFirst(E e) { 
        first = new Node<>(e, first); 
        size++; 
    }
    
       // returns string formed by elements in this list, separated by spaces
    public String toString() { 
        String s = ""; 
        Node<E> current = first; 
        while (current != null) { 
            s += " " + current.getElement(); 
            current = current.getNext(); 
        }
        return s; 
    } 
    
    
    public void rev() {
		if(size > 1) first = revHelper(first).first(); // We want the first one of the Pair which is the first node
}
    
    private Pair<Node<E>> revHelper(Node<E> crr){
		if(crr.getNext() == null) {
			Pair<Node<E>> p = new Pair<Node<E>>(crr, crr);
			this.first = crr;
			return p;
		}
		
		Pair<Node<E>> p = revHelper(crr.getNext());
		p.second().setNext(crr);
		crr.setNext(null);
		p.setSecond(crr);
		
		return new Pair<Node<E>>(p.first(), crr);
}
    
    
    public ArrayList<Pair<E>> CIPairs() { 
		ArrayList<Pair<E>> r = new ArrayList<>();
		if (size > 0) {
			CIPHelper(first, r);
    }
		return r; 
	}
    
    
    private void CIPHelper(Node<E> crr, ArrayList<Pair<E>> r) {
    if(crr != null && crr.getNext() != null) {
		if(((Comparable<E>) crr.getElement()).compareTo(crr.getNext().getElement()) < 0) {
			r.add(new Pair<E>(crr.getElement(), crr.getNext().getElement()));
		}
		CIPHelper(crr.getNext(), r);
		}
    
    }
    

}
