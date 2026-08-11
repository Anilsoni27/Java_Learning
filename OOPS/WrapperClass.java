// For every primtive type we have class 

// when we store the primitive value into wrapper class / object is called boxing 

public class WrapperClass {
    public static void main(String [] args){

        int num = 7 ;
        Integer num1 = num ; // autoboxing
        System.out.println(num1);

        int num2 = num ; // auto-unboxing
        System.out.println(num2);

        String str = "15";

        Integer num3 = Integer.parseInt(str);
        System.out.println(num3*2);


    }
}
