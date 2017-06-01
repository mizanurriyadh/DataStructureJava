import java.util.*;
public class Main {

    static void add(Queue q, int a){
        q.add(a);
        System.out.println("Queue: "+q);
        System.out.println("Add ("+a+")");
    }
    
    
    
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        for(int i=0; i<5; i++)
        {
            add(q, i);
        }
        
        
    }
    
}
