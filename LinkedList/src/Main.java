
import java.util.LinkedList;


public class Main {

    
    public static void main(String[] args) {
       
        // Creating a linked list
        LinkedList ll = new LinkedList();
        
        // Checking LinkedList
        System.out.println("At First Linked List is empty -> "+ll);
        
        // Inserting elements in Linked List
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        System.out.println("After inserting ->"+ll);
        
        // Inserting First & Last position of the list
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println("After inserting 1st & last ->"+ll);
        
        // Getting the size of the LinkedList
        System.out.println(ll.size());
        
        
        // Inserting at position number 2 & Before Lzst
        ll.add(1, "A");
        ll.add(ll.size()-1, "Z");
        System.out.println("A added to 2nd & Z added before last ->"+ll);
        
        // By default it removes 1st element
        ll.remove();
        System.out.println("After Removing ->"+ll);
        
        // Remove using value & Index
        ll.remove("Last");
        System.out.println("After Removing Last -> "+ll);
        
        // Searching Boolean value
        System.out.println( ll.contains("B"));
        System.out.println( ll.contains("M"));
        
        // Index
        System.out.println(ll.indexOf("D"));
        System.out.println(ll.lastIndexOf("D"));
    }   
    
}
