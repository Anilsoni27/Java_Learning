//final keyword as method, variable and class
class Calc {
    final public void show(){

        System.out.println("in Calc show");

    }
    public void  add (int a , int b){

        System.out.println(a+b);
    }
}

// As show method is final it can not be overrided

final class AdvCalc extends Calc   // As parent class is final it can not be inherit
{
//    public void show(){
//      System.out.println("in AdvCalc");
//    }
}


public class FinalKey {
    public static void main(String [] args){

        final int num = 10 ;
        //num = 20 ; cannot change the value of num as num is a final variable 

        AdvCalc obj = new AdvCalc();
        obj.show();

    }
    
}
