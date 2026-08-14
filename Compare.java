import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {
    int age;
    String name;
    

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    
    // public int compareTo(Student that) {
    //     if(this.age > that.age){

    //       return 1;
                
    //     }else{

    //         return -1;

    //     }
        
    // }

   
    
    
}

public class Compare {
    public static void main (String [] args){
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i , Integer j){ //always use Integer class
        //         if(i%10 > j%10){ // compare the last digit and arrange it in ascending order
        //             return 1;
        //         }
        //         else {
        //             return -1;
        //         }

        //     }
            
        // };
        // List<Integer> students = new ArrayList<>();
        // nums.add(34);
        // nums.add(71);
        // nums.add(45);
        // nums.add(99);
        // nums.add(10);
        // nums.add(22);
        // System.out.println(nums);

        // Collections.sort(nums,com);
        // System.out.println(nums);
        Comparator<Student> com = ( i , j) -> i.age > j.age?1:-1; 
        

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(24,"Priya"));
        stud.add(new Student(43,"Neha"));
        stud.add(new Student(12,"Harash"));
        stud.add(new Student(23,"Adarash"));

        System.out.println(stud);
        Collections.sort(stud,com); // print all student name according to ascending orde of age
        for(Student s : stud){
            System.out.println(s);
        }
        
    }
    
}
