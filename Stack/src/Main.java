import java.util.*;
public class Main {
    
    static void push(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("Push("+a+")");
        System.out.println("Stack: "+st);
    }
    
    static void pop(Stack st){
        System.out.println("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: "+st);
    }
    
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Stack: "+st);
        
        for(int i=10; i<=50; i+=10)
        {
            push(st, i);
        }
        
        for(int i=0; i<5; i++)
        {
            pop(st);
        }
    }
    
}
