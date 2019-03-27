package Classes;


public class Pair<E> {
    private E first; 
    private E second; 
    
    public Pair() {
    	first  = second = null;
    }
    
    public Pair(E first, E second) {  
        this.first = first;  
        this.second = second; 
      }
    
    public E first() { return first;}
    
    public void first(E first) { this.first = first;}
    
    public E second() { return second;}
    
    public void second(E second) { this.second = second;}
    
    public void setSecond(E nSec) {this.second = nSec;}
    
}
