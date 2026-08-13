
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// set does not contain index value
// set is collection of unique value and unordered format
// ordered value use TreeSet instead of HashSet

public class SetUse {
    public static void main (String [] args){

        // Collection<Integer> nums = new HashSet<Integer>();

        Set<Integer> nums = new HashSet<Integer>();// gives unordered set

        // TreeSet<Integer> nums = new TreeSet<Integer>(); // gives ordered set

        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(2);
        
        // System.out.println(nums);
        // for(int n : nums){
        //     System.out.println(n);
        // }
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        

    }
    
}
