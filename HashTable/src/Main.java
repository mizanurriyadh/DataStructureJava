
import java.util.Enumeration;
import java.util.Hashtable;


public class Main {
    
    
    public static void main(String[] args) {
        
        Enumeration names;
        String str;
        
        // Creating a HashTable 
        Hashtable<String, String> ht = new Hashtable<String, String>();
        
        // Adding Key & Values
        ht.put("First Name", "Mizanur");
        ht.put("Middle Name", "Rahman");
        ht.put("Last Name", "Riyadh");
        ht.put("Country", "Bangladesh");
        ht.put("State", "Dhaka");
        
        // Size of Hash
        System.out.println("Size of the HashTable: "+ht.size());
       
        // HashTable Contains
        System.out.println("HashTable Contains: "+ht);
        
        // Using Enumeration
        names = ht.keys();
        while(names.hasMoreElements()){
            str = (String) names.nextElement();
            System.out.println(str +": "+ ht.get(str));
        }
        // Remove Hash Elements
        ht.clear();
        System.out.println("After Removing: "+ht);
        
    }

}
