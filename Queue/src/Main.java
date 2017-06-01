import java.util.*;
public class Main {

    static void add(Queue q, int a){
        q.add(a);
        System.out.println("Queue: "+q);
        System.out.println("Add ("+a+")");
    }
    
    static void remove(Queue q)
    {
        System.out.println("Remove -> ");
        Integer a = (Integer) q.remove();
        System.out.println(a);
        System.out.println("Queue: "+q);
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        for(int i=0; i<5; i++)
        {
            add(q, i);
        }
        
        for(int i=0; i<5; i++)
        {
            remove(q);
        }
    }
    
}
