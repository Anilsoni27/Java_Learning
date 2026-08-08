class Calculator{
     public int add(int n1 , int n2){
        System.out.println("Addtion:");

        int r1 = n1 + n2;
        return r1;

    }

    public int sub(int n1 , int n2){
        System.out.println("Subtraction:");
        int r2 = n1 - n2 ;
        return r2;

    }
}

public class Demo1{
    public static void main(String [] args){

        Calculator calc = new Calculator();

        System.out.println(calc.add(4,5));
        System.out.println(calc.sub(8,7));
    }
}