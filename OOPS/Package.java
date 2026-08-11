import tools.Calc;
import tools.AdvCalc;

// import tools.*; // * means all file not the folder

public class Package {
    public static void main (String [] args){
        Calc obj = new Calc();
        AdvCalc obj2 = new AdvCalc();

        System.out.println(obj.add(2,3));
        System.out.println(obj2.mul(2,3));
    }
    
}
