import java.util.HashMap;
import java.util.Map;
public class MAP {
    public static void main (String [] args){
        Map<String,Integer> students = new HashMap<>();
        // Map<String,Integer> students = new HashTable<>();// use to make more synchronized
        students.put("Harsh",34);
        students.put("Anil",35);
        students.put("Sneha",25);
        students.put("Yash",66);
        students.put("Diya",87);
        students.put("Sonu",95);
        students.put("Harsh",67);// keys ar unique it cannot be overridden

        System.out.println(students.get("Sneha"));
        System.out.println(students.keySet()); // print all the keys
        System.out.println(students.values());

        System.out.println(students);
        for(String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
}