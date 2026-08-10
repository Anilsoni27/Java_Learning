class Calc{

    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b ;
    }
}
class AdvCalc extends Calc  // AdvCalc extendin the Calc class this is single level inheritence
{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc  // Multilevel inheritence
{
    public double power(int n1 ,int n2){
        return Math.pow(n1,n2);
    }
}

public class Inheritence {
    public static void main(String [] args){

        // AdvCalc obj = new AdvCalc(); // Single level inheritence
        VeryAdvCalc obj = new VeryAdvCalc(); //Multilevel
        int r1=obj.add(4,5);
        int r2=obj.mul(6,5);
        double r3 = obj.power(2, 3);
        System.out.println(r1+" "+r2+" "+r3);
        
    }
    
}
