import java.util.Arrays;
import java.util.List;

public class ForEach {
    
    public static void main(String [] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(nums);

        // for(int n : nums){
        //     System.out.println(n);
        // }
        nums.forEach(n -> System.out.println(n));
    }
}
