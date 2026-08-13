
import java.util.List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String [] args){

        List<Integer> nums = new ArrayList<Integer>();
        
        nums.add(5);
        nums.add(7);
        nums.add(6);
        nums.add(8);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(7));
        for(Object n : nums){
            int num = (Integer)n;
            System.out.println(num);
        }

        System.out.println(nums);

        
    }
    
}
