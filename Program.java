
import java.util.HashMap;


public class Program {
 
    
    public static void printKeys(HashMap<String,String> hashmap){
        hashmap.keySet().forEach(System.out::println);
    }
    public static void printKeysWhere(HashMap<String,String> hashmap,String text){
        
        hashmap.keySet().forEach(key->{
            if(key.contains(text)){
              System.out.println(key);   
            }});
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap,String text){
        hashmap.keySet().forEach(key ->{
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        });
        
    }
    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        
    }

}
