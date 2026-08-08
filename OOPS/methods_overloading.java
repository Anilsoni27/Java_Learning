class calculator{
    public int add(int a , int b , int c){
        return a + b + c;
    }
    public int add(int a , int b ){
        return a + b;
    }
    public double add (double a , double b){
        return a + b ;

    }
}
public  class methods_overloading {
    public static void main(String [] args){

        calculator obj = new calculator();

        int r1 = obj.add(4 , 5);
        System.out.println(r1);
        int r2 = obj.add(4,5,6);
        System.out.println(r2);
        double r3 = obj.add(4.5,5.5);
        System.out.println(r3);
    }
}