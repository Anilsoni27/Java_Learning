import other.tools.AdvCalc;
import other.tools.Calc;

// import other.*; // * means all file not the folder

public class Package {
    public static void main (String [] args){
        Calc obj = new Calc();
        AdvCalc obj2 = new AdvCalc();
        A obj3 = new A();

        System.out.println(obj.add(2,3));
        System.out.println(obj2.mul(2,3));
    }
    
}
